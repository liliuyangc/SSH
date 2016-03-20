package lee.action;

import com.opensymphony.xwork2.ActionSupport;
import lee.domain.User;

/**
 * Created by liuyang on 2016/3/20.
 */
public class LoginAction extends ActionSupport {
    private User user;
    private String tip;

    //user属性的setter和getter方法
    public void setUser(User user)
    {
        this.user = user;
    }
    public User getUser()
    {
        return this.user;
    }

    //tip属性的setter和getter方法
    public void setTip(String tip)
    {
        this.tip = tip;
    }
    public String getTip()
    {
        return this.tip;
    }

    public String execute() throws Exception
    {
        if (getUser().getName().equals("li")
                && getUser().getPass().equals("li") )
        {
            setTip("登录成功！");
            return SUCCESS;
        }
        else
        {
            setTip("登录失败！！");
            return ERROR;
        }
    }
}
