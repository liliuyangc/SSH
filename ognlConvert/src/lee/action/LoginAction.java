package lee.action;


import com.opensymphony.xwork2.Action;

/**
 * Created by liuyang on 2016/3/20.
 */
public class LoginAction implements Action {

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    private User user;
    private String tip;
    @Override
    public String execute() throws Exception {
        if (getUser().getName().equals("li")&&getUser().getPass().equals("li"))
        {
            setTip("转换成功");
            return SUCCESS;
        }
        else
        {
            setTip("转换失败");
            return ERROR;
        }
    }
}
