package Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue
    private int QId;
    private String User;
    private String Question;


    public Question(){}

    public Question(int QId){this.QId=QId;}

    public Question(int QId,String User,String Question){this.QId=QId;this.User=User;this.Question= Question;}

    public int getQId() {
        return QId;
    }

    public void setQId(int QId) {
        this.QId = QId;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }



}
