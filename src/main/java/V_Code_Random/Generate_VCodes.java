package V_Code_Random;


import java.util.Random;

public class Generate_VCodes {

    Random V_Codes;

    public String Genetate()
    {
        String Code;
        Random f =new Random();
        int t= f.nextInt();
        System.out.println(t);
        for (int s=0;s>t;s++)
{
    t= f.nextInt();

}

        if(t<0){
            t=t+999999999;
        }

        Code=Integer.toString(t);
        return  Code;
    }

    public static void main(String[] args) {

        Generate_VCodes generate_vCodes=new Generate_VCodes();

        System.out.println(  generate_vCodes.Genetate() );
    }
}
