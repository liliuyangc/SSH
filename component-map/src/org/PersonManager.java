package org;

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
        Name n = new Name("hsa" , "ha");
        Map<String ,Integer> power = new HashMap<String ,Integer>();
        power.put("运气" , 96);
        power.put("智慧" , 98);
        n.setPower(power);
        yeeku.setName(n);
        session.save(yeeku);
        power.clear();
        tx.commit();
        HibernateUtil.closeSession();
    }

}
