package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


/**
 * Created by liliuyang on 2016/3/14.
 */
public class LoginRegistAction extends ActionSupport {
    private String username;
    private String password;
    private String tip;

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

    @Action(value="/regist",
            results={@Result(name="success", location="/welcome.jsp")}
    )
    public String regist()throws Exception
    {
        ActionContext.getContext().getSession().put("user",getUsername());
        setTip("恭喜你"+getUsername()+"注册成功");
        System.out.println("访问到了");
        return SUCCESS;
    }

    @Action(value ="/login",results = {@Result(name="success",location = "/welcome.jsp"),@Result(name="error",location = "error.jsp")})
    public String login() throws Exception {
        if(getUsername().equals("li")&&getPassword().equals("li"))
        {
            ActionContext.getContext().getSession().put("user",getUsername());
            setTip("欢迎"+getUsername()+"登录成功");
            return SUCCESS;
        }
        else
        {
            setTip("登录失败");
            return ERROR;
        }
    }
}
