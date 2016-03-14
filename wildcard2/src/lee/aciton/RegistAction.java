package lee.aciton;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by liliuyang on 2016/3/14.
 */
public class RegistAction extends ActionSupport {
    //封装用户请求参数的两个属性
    private String username;
    private String password;
    //封装处理结果的tip属性
    private String tip;
    //username属性对应的setter和getter方法
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    //password属性对应的getter和setter方法
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    //tip属性对应的setter和getter方法
    public String getTip()
    {
        return tip;
    }
    public void setTip(String tip)
    {
        this.tip = tip;
    }
    //Action包含的默认的控制逻辑
    public String execute() throws Exception
    {
        ActionContext.getContext().getSession()
                .put("user" , getUsername());
        setTip("恭喜您," + getUsername() + ",您已经注册成功！");
        return SUCCESS;
    }
}
