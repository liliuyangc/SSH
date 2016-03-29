package lee;

import lee.domain.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyang on 2016/3/29.
 */
public class PersonManager {

    public static void main(String[] args)
    {
        PersonManager mgr = new PersonManager();
        mgr.createAndStorePerson();
        HibernateUtil.sessionFactory.close();
    }
    //创建并保存Person对象
    private void createAndStorePerson()
    {
        //打开线程安全的session对象
        Session session = HibernateUtil.currentSession();
        //打开事务
        Transaction tx = session.beginTransaction();
        //创建Person对象
        Person yeeku = new Person();
        //为Person对象设置属性
        yeeku.setAge(29);
        yeeku.setName("crazyit.org");
        //创建List集合
        List<String> schools = new ArrayList<String>();
        schools.add("小学");
        schools.add("中学");
        //设置List集合属性
        yeeku.setSchools(schools);
        session.save(yeeku);
        tx.commit();
        HibernateUtil.closeSession();
    }
}
