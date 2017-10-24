package Dao;


import Entities.users;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class usersDaoImpl implements usersDao {


    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public String Insert(users users) {

        sessionFactory.getCurrentSession().save(users);
    return "Doen";
    }

    public String Delete(String username) {

        sessionFactory.getCurrentSession().delete(new users(username));
        return "Doen";
    }

    public String Update(users users) {

        sessionFactory.getCurrentSession().update(users);
        return "Doen";
    }

    public users Select(String username) {
        return (users) sessionFactory.getCurrentSession().get(users.class,username);

    }

    public List<users> SelectAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(users.class).list();

    }

    public users SelectByVcode(String V_Code) {
        return (users) sessionFactory.getCurrentSession().get(users.class,V_Code);

    }
}
