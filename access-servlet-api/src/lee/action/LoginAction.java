package lee.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liliuyang on 2016/3/14.
 */
public class LoginAction implements Action,ServletResponseAware {
    private String userName;
    private String passWord;
    private HttpServletResponse response;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String execute() throws Exception {
        ActionContext actionContext=ActionContext.getContext();
        //通过ac访问ap范围的属性值
        Integer counter=(Integer)actionContext.getApplication().get("counter");
        if (counter==null)
        {
            counter=1;
        }
        else
        {
            counter=counter+1;
        }
        //通过ap设置ap的范围属性
        actionContext.getApplication().put("counter",counter);
        actionContext.getSession().put("user",userName);
        if (getUserName().equals("li")&&getPassWord().equals("li"))
        {
            Cookie c=new Cookie("user",getUserName());
            c.setMaxAge(60*60);
            response.addCookie(c);
            actionContext.put("tip","服务器提示：您已登录成功");
            return SUCCESS;
        }
        else
        {
            actionContext.put("tip","登录失败");
            return ERROR;
        }

    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.response=httpServletResponse;
    }
}
