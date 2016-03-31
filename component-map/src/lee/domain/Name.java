package lee.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuyang on 2016/3/30.
 */
public class Name {
    //定义first属性
    private String first;
    //定义last属性
    private String last;
    //引用拥有该Name的Person对象
    private Person owner;
    private Map<String ,Integer> power
            = new HashMap<String ,Integer>();

    //无参数的构造器
    public Name()
    {
    }
    //初始化全部属性的构造器
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

    //power属性的setter和getter方法
    public void setPower(Map<String ,Integer> power)
    {
        this.power = power;
    }
    public Map<String ,Integer> getPower()
    {
        return this.power;
    }

}
