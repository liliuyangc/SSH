package lee.domain;

/**
 * Created by liuyang on 2016/3/29.
 */
public class Name {
    //定义first属性
    private String first;
    //定义last属性
    private String last;
    //引用拥有该Name的Person对象
    private Person owner;

    //无参数的构造器
    public Name()
    {
    }
    //初始化first、last属性的构造器
    public Name(String first , String last)
    {
        this.first = first;
        this.last = last;
    }

    //first属性的setter和getter方法
    public void setFirst(String first)
    {
        this.first = first;
    }
    public String getFirst()
    {
        return this.first;
    }

    //last属性的setter和getter方法
    public void setLast(String last)
    {
        this.last = last;
    }
    public String getLast()
    {
        return this.last;
    }

    //owner属性的setter和getter方法
    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    public Person getOwner()
    {
        return this.owner;
    }
}
