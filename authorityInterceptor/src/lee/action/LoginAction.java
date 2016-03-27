package lee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by liuyang on 2016/3/27.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    //username属性的setter和getter方法
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return this.username;
    }

    //password属性的setter和getter方法
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }

    public String execute() throws Exception
    {
        System.out.println("进入execute方法执行体..........");
        if (getUsername().equals("li")
                && getPassword().equals("li") )
        {
            ActionContext ctx = ActionContext.getContext();
            Map session = ctx.getSession();
            session.put("user" , getUsername());
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }
}
