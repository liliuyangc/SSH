package lee.action;

import com.opensymphony.xwork2.ActionSupport;
import lee.exception.MyException;

/**
 * Created by liuyang on 2016/3/15.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String tip;

    @Override
    public String execute() throws Exception {
        if (getUsername().equalsIgnoreCase("user"))
        {
            throw new MyException("自定义异常");
        }
        if (getUsername().equalsIgnoreCase("sql"))
        {
            throw new java.sql.SQLException("用户名不能为sql");
        }
        if (getUsername().equals("li")&&getPassword().equalsIgnoreCase("li"))
        {
            setTip("登录成功");
            return SUCCESS;
        }
        else
        {
            return ERROR;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
