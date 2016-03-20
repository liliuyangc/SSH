package lee.action;

import com.opensymphony.xwork2.ActionSupport;
import lee.domain.User;

/**
 * Created by liuyang on 2016/3/20.
 */
public class LoginAction extends ActionSupport{
    private User user;

    //user属性的setter和getter方法
    public void setUser(User user)
    {
        this.user = user;
    }
    public User getUser()
    {
        return user;
    }
    //没有execute方法，直接使用ActionSupport的execute方法
}
