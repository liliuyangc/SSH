package action;

/**
 * Created by liliuyang on 2016/3/16.
 */
import org.apache.struts2.convention.annotation.Action;

import org.apache.struts2.convention.annotation.ExceptionMapping;

import org.apache.struts2.convention.annotation.ExceptionMappings;

import org.apache.struts2.convention.annotation.Namespace;

import org.apache.struts2.convention.annotation.ParentPackage;

import org.apache.struts2.convention.annotation.Result;

import org.apache.struts2.convention.annotation.Results;



import com.opensymphony.xwork2.ActionSupport;



/**

 * Struts2基于注解的Action配置

 *

 */

@ParentPackage("struts-default")

@Namespace("/annotation_test")

@Results( { @Result(name = "success", location = "/main.jsp"),

        @Result(name = "error", location = "/error.jsp") })

@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })

public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 2730268055700929183L;

    private String loginName;

    private String password;



    @Action("login") //或者写成  @Action(value = "login")

    public String login() throws Exception {



        if ("yjd".equals(loginName) && "yjd".equals(password)) {

            return SUCCESS;

        } else {

            return ERROR;

        }

    }

    @Action(value = "add", results = { @Result(name = "success", location = "/index.jsp") })

    public String add() throws Exception {

        return SUCCESS;

    }

    public String getLoginName() {

        return loginName;

    }

    public void setLoginName(String loginName) {

        this.loginName = loginName;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password= password;

    }

}
