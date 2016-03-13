package org.lee.action;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.Action;


/**
 * Created by liuyang on 2016/3/13.
 */
public class LoginAction implements Action {
    private String userName;
    private String passWord;

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

    public String execute()
    {
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
            actionContext.put("tip","服务器提示：您已登录成功");
            return SUCCESS;
        }
        else
        {
            actionContext.put("tip","登录失败");
            return ERROR;
        }
    }
}
