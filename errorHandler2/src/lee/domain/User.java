package lee.domain;

import java.util.Date;

/**
 * Created by liuyang on 2016/3/20.
 */
public class User {
    private String name;
    private Integer age;
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

    //age属性的setter和getter方法
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public Integer getAge()
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
