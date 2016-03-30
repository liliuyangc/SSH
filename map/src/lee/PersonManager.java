package lee;

import lee.HibernateUtil;
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
        //打开线程安全的session对象
        Session session = HibernateUtil.currentSession();
        //打开事务
        Transaction tx = session.beginTransaction();
        //创建Person对象
        Person yeeku = new Person();
        //为Person对象设置属性
        yeeku.setAge(29);
        yeeku.setName("crazyit.org");
        //创建Map集合
        Map<String ,Float> m = new HashMap<String ,Float>();
        m.put("语文", 67f);
        m.put("英文", 45f);
        //设置Map集合属性
        yeeku.setScores(m);
        session.save(yeeku);
        m.clear();//map提交前要更新
        tx.commit();
        HibernateUtil.closeSession();
    }
}
