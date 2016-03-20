package lee.action;

import com.opensymphony.xwork2.Action;

import java.util.Map;

/**
 * Created by liuyang on 2016/3/20.
 */
public class LoginAction implements Action {
    //action类中包含一个map类型的参数
    //Map的value类型为USer类型
    private Map<String,User> users;
    private String tip;

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
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
       //在控制台输出 st2肥壮的list对象
        System.out.println(getUsers());
        if (getUsers().get("one").getName().equals("li")&&getUsers().get("one").getPass().equals("li"))
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
