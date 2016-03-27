package lee.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by liuyang on 2016/3/27.
 */
public class FileDownloadAction extends ActionSupport {
    private String inputPath;

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }
/*
* 定义一个返回inputstream的方法
* 该方法将作为被下载文件的入口
* 且需要配置stream类型结果时制定inputstream参数
* inputname参数的值就是方法get的前缀，首字母小写的字符串*/
    public InputStream getTargetFile() throws Exception
    {
        //servleContent提供getresourceastrean方法
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
}
