package Encriptor;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * Created by RESO on 10/14/2017.
 */
public class Encritp {

    public String Encript(String Password)
    {

        Md5PasswordEncoder encoder =new Md5PasswordEncoder();
        String EncodedPass =encoder.encodePassword(Password,null);

        return EncodedPass;
    }

    public static void main(String[] args) {

        Encritp encritp=new Encritp();
        System.out.println( encritp.Encript("1") );
    }
}
