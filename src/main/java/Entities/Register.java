package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {

    @Id
    private String UserMail;
    private String UserName;
    private String UserPassWord;


    public Register(){}
    public Register(String UserMail){this.UserMail=UserMail;}
    public Register(String UserMail,String UserName,String UserPassWord)
    {

        this.UserMail=UserMail;
        this.UserName=UserName;
        this.UserPassWord=UserPassWord;

    }

    public String getUserPassWord() {
        return UserPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        UserPassWord = userPassWord;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserMail() {
        return UserMail;
    }

    public void setUserMail(String userMail) {
        UserMail = userMail;
    }


}
