package lee.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2016/3/29.
 */
public class Person  {
    private Integer id;
    private String name;
    private int age;
    private List<String> schools =new ArrayList<String>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }
}
