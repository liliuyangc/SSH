package lee.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by liuyang on 2016/3/21.
 */
public class RegistAction extends ActionSupport {

    private String name;
    private String pass;
    private int age;
    private Date birth;

    //name属性的setter和getter方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    //pass属性的setter和getter方法
    public void setPass(String pass)
    {
        this.pass = pass;
    }
    public String getPass()
    {
        return this.pass;
    }

    //age属性的setter和getter方法
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }

    //birth属性的setter和getter方法
    public void setBirth(Date birth)
    {
        this.birth = birth;
    }
    public Date getBirth()
    {
        return this.birth;
    }

}
