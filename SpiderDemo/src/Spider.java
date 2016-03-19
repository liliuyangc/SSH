import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.htmlparser.RemarkNode;
import org.htmlparser.StringNode;
import org.htmlparser.Node;
import org.htmlparser.tags.*;
import org.htmlparser.Parser;
import org.htmlparser.filters.StringFilter;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import java.util.Queue;
import java.util.LinkedList;
public class Spider implements Runnable {
    boolean search_key_words = false;
    int count = 0;
    int limitsite = 10;
    int countsite = 1;
    String keyword = "中国";//搜索关键字
    Parser parser = new Parser();
    // List linklist = new ArrayList();
    String startsite = "";//搜索的其实站点
    SearchResultBean srb;//保存搜索结果
    List resultlist = new ArrayList();//搜索到关键字链接列表
    List searchedsite = new ArrayList();//已经被搜索站点列表
    Queue linklist = new LinkedList();//需解析的链接列表
    HashMap<String, ArrayList<String>> disallowListCache = new HashMap<String, ArrayList<String>>();
    public Spider(String keyword, String startsite) {
        this.keyword = keyword;
        this.startsite = startsite;
        linklist.add(startsite);
        srb = new SearchResultBean();
    }
    public void run() {
        // TODO Auto-generated method stub
        search(linklist);
    }
    public void search(Queue queue) {
        String url = "";
        while(!queue.isEmpty()){
            url = queue.peek().toString();//查找列队
            try {
                if (!isSearched(searchedsite, url)) {
                    if (isRobotAllowed(new URL(url)))//检查该链接是否被允许搜索
                        processHtml(url);
                    else
                        System.out.println("this page is disallowed to search");
                }
            } catch (Exception ex) {
            }
            queue.remove();

        }

    }
    /**
     * 解析HTML
     * @param url
     * @throws ParserException
     * @throws Exception
     */
    public void processHtml(String url) throws ParserException, Exception {
        searchedsite.add(url);
        count = 0;
        System.out.println("searching ... :" + url);
        parser.setURL(url);
        parser.setEncoding("GBK");
        URLConnection uc = parser.getConnection();
        uc.connect();
        //uc.getLastModified();
        NodeIterator nit = parser.elements();

        while (nit.hasMoreNodes()) {
            Node node = nit.nextNode();
            parserNode(node);
        }
        srb.setKeywords(keyword);
        srb.setUrl(url);
        srb.setCount_key_words(count);
        resultlist.add(srb);
        System.out.println("count keywords is :" + count);
        System.out.println("----------------------------------------------");
    }
    /**
     * 处理HTML标签
     * @param tag
     * @throws Exception
     */
    public void dealTag(CompositeTag tag) throws Exception {
        NodeList list = tag.getParent().getChildren();
        if (list != null) {
            NodeIterator it = list.elements();
            while (it.hasMoreNodes()) {
                Node node = it.nextNode();
                parserNode(node);
            }
        }
    }
    /**
     * 处理HTML标签结点
     * @param node
     * @throws Exception
     */
    public void parserNode(Node node) throws Exception{
        if (node instanceof StringNode) {//判断是否是文本结点
            StringNode sNode = (StringNode) node;
            StringFilter sf = new StringFilter(keyword,false);
            search_key_words = sf.accept(sNode);
            if (search_key_words) {
                count++;
            }
            // System.out.println("text is :"+sNode.getText().trim());
        } else if (node instanceof Tag) {//判断是否是标签库结点
            CompositeTag atag = (CompositeTag) node;
            if (atag instanceof TitleTag) {//判断是否是标TITLE结点
                srb.setTitle(atag.getText());
            }
            if (atag instanceof LinkTag) {//判断是否是标LINK结点
                LinkTag linkatag = (LinkTag) atag;
                checkLink(linkatag.getLink(), linklist);
                // System.out.println("-----------------this is link --------------");
            }
            dealTag(atag);
        } else if (node instanceof RemarkNode) {//判断是否是注释
            // System.out.println("this is remark");
        }
    }
    /*
     * 检查链接是否需要加入列队
     */
    public void checkLink(String link, Queue queue) {
        if (link != null && !link.equals("") && link.indexOf("#") == -1) {
            if (!link.startsWith("http://") && !link.startsWith("ftp://")
                    && !link.startsWith("www.")) {
                link = "file:///" + link;
            } else if (link.startsWith("www.")) {
                link = "http://" + link;
            }
            if (queue.isEmpty())
                queue.add(link);
            else {
                String link_end_=link.endsWith("/")?link.substring(0,link.lastIndexOf("/")):(link+"/");
                if (!queue.contains(link)&&!queue .contains(link_end_)) {
                    queue.add(link);
                }
            }
        }
    }
    /**
     * 检查该链接是否已经被扫描
     * @param list
     * @param url
     * @return
     */
    public boolean isSearched(List list, String url) {
        String url_end_ = "";
        if (url.endsWith("/")) {
            url_end_ = url.substring(0, url.lastIndexOf("/"));
        } else {
            url_end_ = url + "/";
        }
        if (list.size() > 0) {
            if (list.indexOf(url) != -1 || list.indexOf(url_end_) != -1) {
                return true;
            }
        }
        return false;
    }
    /**
     * 检查URL是否被允许搜索
     * @param urlToCheck
     * @return
     */
    private boolean isRobotAllowed(URL urlToCheck) {
        String host = urlToCheck.getHost().toLowerCase();// 获取给出RUL的主机
        // System.out.println("主机="+host);
        // 获取主机不允许搜索的URL缓存
        ArrayList<String> disallowList = disallowListCache.get(host);
        // 如果还没有缓存,下载并缓存。
        if (disallowList == null) {
            disallowList = new ArrayList<String>();
            try {
                URL robotsFileUrl = new URL("http://" + host + "/robots.txt");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(robotsFileUrl.openStream()));
                // 读robot文件，创建不允许访问的路径列表。
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.indexOf("Disallow:") == 0) {// 是否包含"Disallow:"
                        String disallowPath = line.substring("Disallow:"
                                .length());// 获取不允许访问路径
                        // 检查是否有注释。
                        int commentIndex = disallowPath.indexOf("#");
                        if (commentIndex != -1) {
                            disallowPath = disallowPath.substring(0,
                                    commentIndex);// 去掉注释
                        }
                        disallowPath = disallowPath.trim();
                        disallowList.add(disallowPath);
                    }
                }
                for (Iterator it = disallowList.iterator(); it.hasNext();) {
                    System.out.println("Disallow is :" + it.next());
                }
                // 缓存此主机不允许访问的路径。
                disallowListCache.put(host, disallowList);
            } catch (Exception e) {
                return true; // web站点根目录下没有robots.txt文件,返回真
            }
        }
        String file = urlToCheck.getFile();
        // System.out.println("文件getFile()="+file);
        for (int i = 0; i < disallowList.size(); i++) {
            String disallow = disallowList.get(i);
            if (file.startsWith(disallow)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Spider ph = new Spider("htmlparser", "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=baidu&wd=htmlparser&oq=htmlparser.jar&rsv_pq=d6af1056000241a3&rsv_t=051aNzXHU9SLxJsXTffwwXms%2B1SbYnlFm9xsuYdrHLmZmA8MYW5N%2F2Q8L7o&rsv_enter=1&inputT=235&rsv_sug3=22&rsv_sug1=9&rsv_sug7=100&bs=htmlparser.jar");
        try {
            // ph.processHtml();
            Thread search = new Thread(ph);
            search.start();//启动线程
        } catch (Exception ex) {
        }
    }
}