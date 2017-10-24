package Dao;


import Entities.authorities;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class authoritiesDaoImpl implements authoritiesDao {


    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public String Insert(authorities authorities) {

        sessionFactory.getCurrentSession().save(authorities);
    return "Doen";
    }

    public String Delete(String username) {

        sessionFactory.getCurrentSession().delete(new authorities(username));
        return "Doen";
    }

    public String Update(authorities authorities) {

        sessionFactory.getCurrentSession().update(authorities);
        return "Doen";
    }

    public authorities Select(String username) {
        return (authorities)sessionFactory.getCurrentSession().get(authorities.class,username);
    }

    public List<authorities> SelectAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(authorities.class).list();
    }
}
