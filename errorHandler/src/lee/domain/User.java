package lee.domain;

/**
 * Created by liuyang on 2016/3/20.
 */
public class User {
    private String name;
    private String pass;

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

}
