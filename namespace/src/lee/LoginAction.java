package lee;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by liliuyang on 2016/3/14.
 */
public class LoginAction implements Action {
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
        if (getUsername().equals("li")
                && getPassword().equals("li") )
        {
            ActionContext.getContext().getSession()
                    .put("user", getUsername());
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }
}
