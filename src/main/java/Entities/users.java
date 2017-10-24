package Entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {


    @Id
    private String username;
    private String password;
    private int enabled;

    public String getV_Code() {
        return V_Code;
    }

    public void setV_Code(String v_Code) {
        V_Code = v_Code;
    }

    private String V_Code;

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public users(){}
    public users(String username){
        this.username=username;
    }

    public users(String username,String password,int enabled,String UserEmail,String V_Code){

        this.username=username;
        this.password=password;
        this.enabled=enabled;
         this.V_Code=V_Code;
    }


}
