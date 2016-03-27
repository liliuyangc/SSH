package lee.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by liuyang on 2016/3/27.
 */
public class AuthorityDownAction implements Action {
    private String inputPath;

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public InputStream getTargetFile() throws Exception
    {
        //ServletContext提供getResourceAsStream()方法
        //返回指定文件对应的输入流
        return ServletActionContext.getServletContext()
                .getResourceAsStream(inputPath);
    }

    public String execute() throws Exception
    {
        //取得ActionContext实例
        ActionContext ctx = ActionContext.getContext();
        //通过ActionContext访问用户的HttpSession
        Map session = ctx.getSession();
        String user = (String)session.get("li");
        //判断Session里的user是否通过检查
        if ( user !=  null && user.equals("li"))
        {
            return SUCCESS;
        }
        ctx.put("tip"
                , "您还没有登录，或者登录的用户名不正确，请重新登录！");
        return LOGIN;
    }
}
