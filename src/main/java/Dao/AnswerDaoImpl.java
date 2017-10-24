package Dao;

import Entities.Answer;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RESO on 10/18/2017.
 */
@Repository
public class AnswerDaoImpl implements AnswerDao{

    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public String Insert(Answer answer) {
       sessionFactory.getCurrentSession().save(answer);
        return "Doen";

    }

    public String Delete(int QId) {

       sessionFactory.getCurrentSession().delete(new Answer(QId));
        return "Doen";
    }

    public String Update(Answer answer) {
       sessionFactory.getCurrentSession().update(answer);
        return "Doen";
    }

    public Answer Select(int QId) {
        return (Answer)sessionFactory.getCurrentSession().get(Answer.class,QId);
    }

    public List<Answer> SelectAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(Answer.class).list();
    }
}
