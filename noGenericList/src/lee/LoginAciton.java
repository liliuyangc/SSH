package lee;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by liuyang on 2016/3/20.
 */
public class LoginAciton extends ActionSupport{
    private List users;
    private String tip;

    public List getUsers() {
        return users;
    }

    public void setUsers(List users) {
        this.users = users;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(getUsers());
        User firstUser=(User)getUsers().get(0);
        if (firstUser.getName().equals("li")&&firstUser.getPass().equals("li"))
        {
            setTip("登录成功");
            return SUCCESS;
        }
        else
        {
            setTip("登录失败");
            return ERROR;
        }
    }
}
