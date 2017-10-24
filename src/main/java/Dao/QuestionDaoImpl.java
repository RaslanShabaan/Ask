package Dao;

import Entities.Question;
import Entities.Register;
import Entities.authorities;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao{

    SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String Insert(Question question) {

       sessionFactory.getCurrentSession().save(question);
    return "Doen";
    }

    public String Delete(int QId) {
       sessionFactory.getCurrentSession().delete(new Question(QId));
        return "Doen";
    }

    public String Update(Question question) {
       sessionFactory.getCurrentSession().update(question);
        return "Doen";
    }

    public Question Select(int QId) {
        return (Question) sessionFactory.getCurrentSession().get(Question.class,QId);
    }

    public List<Question> SelectAllUsers() {
        return sessionFactory.getCurrentSession().createCriteria(Question.class).list();
    }


    public ArrayList<String> Select_U_Questions(String User) {

        ArrayList<String> search =new ArrayList<String>();

        org.hibernate.Query  d= sessionFactory.getCurrentSession().createQuery("from  Question  where User=? ");
        d.setString(0,User);

        List<Question> l =d.list();
        for(Question z:l)
        {
            int s=z.getQId();
            String f=Integer.toString(s);
            search.add(z.getQuestion());
            search.add(f);
        }

        return search;

    }
}
