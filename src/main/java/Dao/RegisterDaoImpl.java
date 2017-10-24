package Dao;


import Entities.Register;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegisterDaoImpl implements RegisterDao {

    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String Insert(Register register) {
        sessionFactory.getCurrentSession().save(register);
        return "Doen";
    }

    public String Delete(String UserMail) {
        sessionFactory.getCurrentSession().delete(new Register(UserMail));
        return "Doen";
    }

    public String Update(Register register) {
        sessionFactory.getCurrentSession().update(register);
        return "Doen";
    }

    public Register Select(String UserMail) {
        return (Register)sessionFactory.getCurrentSession().get(Register.class,UserMail);
    }

    public List<Register> SelectAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(Register.class).list();
    }
}

