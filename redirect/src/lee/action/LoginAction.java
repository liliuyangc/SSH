package lee.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by liliuyang on 2016/3/15.
 */
public class LoginAction extends ActionSupport {
    private String username;
    //username属性的setter和getter方法
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }
}
