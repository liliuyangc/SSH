package lee.domain;

/**
 * Created by liuyang on 2016/3/30.
 */
public class Person {
    //标识属性
    private Integer id;
    //普通属性age
    private int age;
    //组件属性name
    private Name name;

    //id属性的setter和getter方法
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getId()
    {
        return this.id;
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

    //name属性的setter和getter方法
    public void setName(Name name)
    {
        this.name = name;
    }
    public Name getName()
    {
        return this.name;
    }
}
