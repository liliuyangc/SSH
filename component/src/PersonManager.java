import lee.domain.Name;
import lee.domain.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.Map;

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

    private void createAndStorePerson()
    {
        Session session = HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        //创建Person对象
        Person yeeku = new Person();
        //为Person对象设置属性
        yeeku.setAge(29);
        Name n = new Name("li" , "li");
        yeeku.setName(n);
        session.save(yeeku);
        tx.commit();
        HibernateUtil.closeSession();
    }

}
