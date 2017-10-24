package Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {


    @Id
    @GeneratedValue
    private int AnswerId;
    private int QId;
    private String User;
    private String Question;
    private String Answer;

    public Answer(){}
    public Answer(int AnswerId){this.AnswerId=AnswerId;}
    public Answer(int AnswerId,String User,String Question,String Answer,int QId){

        this.AnswerId=AnswerId;
        this.User=User;
        this.Question=Question;
        this.Answer=Answer;
        this.QId=QId;
    }


    public int getAnswerId() {
        return AnswerId;}
    public void setAnswerId(int answerId) {
        AnswerId = answerId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public int getQId() {
        return QId;
    }
    public void setQId(int QId) {
        this.QId = QId;
    }


}
