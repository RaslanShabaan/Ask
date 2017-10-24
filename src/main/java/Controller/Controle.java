package Controller;

import Encriptor.Encritp;
import Entities.*;
import Mail.SendMail;
import V_Code_Random.Generate_VCodes;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controle {

  public static String Current_User;

    // users db configuration
    @Autowired(required = true)
    @Qualifier("usersDaoService")
    Service.usersDaoService usersDaoService;

    // authorities db configuration
    @Autowired(required = true)
    @Qualifier("authoritiesDaoService")
    Service.authoritiesDaoService authoritiesDaoService;

    // register db configuration
    @Autowired(required = true)
    @Qualifier("registerDaoSer")
    Service.RegisterDaoSer registerDaoSer;


    // question db configuration
    @Autowired(required = true)
    @Qualifier("questionDaoService")
    Service.QuestionDaoService questionDaoService;


    // answer db configuration
    @Autowired(required = true)
    @Qualifier("answerDaoService")
    Service.AnswerDaoService answerDaoService;


    // return Home page
    @RequestMapping(value = "/Home",method = RequestMethod.GET)
public ModelAndView Home(@RequestParam(value = "Vcode", required = false) String V_Code , HttpSession  sion , HttpSession  ion) {

        ModelAndView modelAndView = new ModelAndView("Home");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Current_User = authentication.getName();

//
//        Question question=new Question();
//        Answer answer=new Answer();
//        question.setQuestion("ssssssssssssssssssss");
//        question.setUser("ssss");
//        questionDaoService.Insert(question);

//        answer.setQuestion("dddd");
//        answer.setUser("dddddddddd");
//        answer.setAnswer("dddddddddddddd");
//        answerDaoService.Insert(answer);

//    if (V_Code != null) {
//        // check v code in Database ******
//
//        users users =usersDaoService.SelectByVcode(V_Code);
//        if (users != null) {
//            // change enabled = 1 in database to Enable Login
//            users.setEnabled(1);
//            usersDaoService.Update(users);
//
//            String verfyMessage = "Done Verification Email ...";
//   //         modelAndView.addObject("verify", verfyMessage);
//
//            System.out.println("/////////////////////////////////");
//
//        } else {
//            ModelAndView modell = new ModelAndView("Register");
//         return modell;
//
//        }

        System.out.println("....." + V_Code +"......");


        ArrayList<String> d =new ArrayList<String>();
        d= questionDaoService.Select_U_Questions(Current_User);

        System.out.println(d+"---------------------------------------------------");
// to bring Qid only from question db
        ArrayList<Integer> ccc =new ArrayList<Integer>();
        int size =d.size()/2;

        int o=1;
        for (int t=0 ;t<size;t++)
        {
            String cc= d.get(o);
            int ttt=Integer.parseInt(cc);
            ccc.add(ttt);
            o=o+2;
        }

        Answer answer=new Answer();

        ArrayList<String> cv = new ArrayList<String>();

// bring answer objecct from answer db
List <Answer> v=new ArrayList<Answer>();
        for (int tttt=0;tttt<ccc.size();tttt++) {

            System.out.println(tttt);
            answer = answerDaoService.Select(ccc.get(tttt));

            v.add(answer);
        }

        // rempve null
   for (int y=0;y<v.size();y++ )
   {
       if(v.contains(null))
       {
           v.remove(v.indexOf(null));
           System.out.println("--------------null-----------------");
       }
   }


      //  bring only answer in object
        ArrayList<String> b=new ArrayList<String>();
        for (int u=0;u<v.size();u++)
        {
            b.add(v.get(u).getAnswer());
            b.add(v.get(u).getUser());
            b.add(v.get(u).getQuestion());
            String vv=Integer.toString(v.get(u).getQId());
            b.add(vv);
        }

        // answer
        System.out.println(b);
        sion.setAttribute("hellow",b);
        sion.setAttribute("ellow",d);


        return modelAndView;

    }



    // show login page and spring security make authentication
    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public ModelAndView Login(@RequestParam(name = "error", required = false) String error) {

        ModelAndView modelAndView = new ModelAndView("Login");
        if (error != null) {
            modelAndView.addObject("error", "Please Enter Correct Data :)");
        }


        return modelAndView;
    }

    // return logout function
    @RequestMapping(value = "/Logout",method = RequestMethod.GET)
    public ModelAndView Logout(HttpServletRequest request, HttpServletResponse response)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if(auth !=null)
        {
            new SecurityContextLogoutHandler().logout(request,response,auth);
        }

        System.out.println("-----------------------------");
        ModelAndView modelAndView =new ModelAndView("Login");
        return modelAndView;
    }


    @RequestMapping(value = "/GoToAsk",method = RequestMethod.GET)
    public ModelAndView GoToAsk()
    {

        ModelAndView modelAndView =new ModelAndView("Ask");
        return modelAndView;
    }

    @RequestMapping(value = "/GoToHome",method = RequestMethod.GET)
    public ModelAndView GoToHome(HttpSession session)
    {

//

        ModelAndView modelAndView =new ModelAndView("Home");
        return modelAndView;
    }


    @RequestMapping(value = "/GoToRegister",method = RequestMethod.GET)
    public ModelAndView GoToRegister()
    {

        ModelAndView modelAndView =new ModelAndView("Register");
        return modelAndView;
    }


    // return register functions
    @RequestMapping(value = "/Register",method = RequestMethod.POST)
    public ModelAndView Register(@RequestParam("UName")String UName,@RequestParam("UPassWord")String UPassWord,@RequestParam("UMail")String UMail)
    {

        ModelAndView modelAndView =new ModelAndView("Login");

        Encritp encritp =new Encritp();
        Register register=new Register();
        Generate_VCodes generate_vCodes =new Generate_VCodes();
        String VCode=generate_vCodes.Genetate();


        SendMail sendMail =new SendMail();
       String MailResult =sendMail.SendMail(UMail,UName,VCode);
        System.out.println("--------------------------------------------------------------");
        // check mail been send
        if(MailResult .equals("Doen"))
        {

            // insert user data into register db

            register.setUserMail(UMail);
            register.setUserName(UName);
            String Pass=encritp.Encript(UPassWord);
            register.setUserPassWord(Pass);

            registerDaoSer.Insert(register);

           // insert user data into login db

            users users =new users();
            users.setEnabled(0);
            users.setUsername(UMail);
            users.setPassword(Pass);

            users.setV_Code(VCode);
            usersDaoService.Insert(users);

           // insert user data into authorities db

            authorities authorities =new authorities();
            authorities.setUsername(UMail);
            authorities.setAuthority("ROLE_USER");

            authoritiesDaoService.Insert(authorities);

            modelAndView.addObject("Reg","Doen Register Check Your Mail :) ");

        }else {

            modelAndView.addObject("Reg","Sorry SomeThing Went Wrong Try Another Time :) ");
        }


        System.out.println(VCode+" From Register ------------------------------- ");
        return modelAndView;
    }

// // user insert question
    @RequestMapping(value = "/Ask",method = RequestMethod.POST)
    public ModelAndView Ask(@RequestParam("Question")String Question)
    {

        System.out.println(Question);
        System.out.println(Current_User);

        //
        Question question=new Question();
        question.setQuestion(Question);
        question.setUser(Current_User);
        questionDaoService.Insert(question);





        ModelAndView modelAndView =new ModelAndView("Home");
        return modelAndView;

    }

    // // user insert answer
    @RequestMapping(value = "/Answer",method = RequestMethod.POST)
    public ModelAndView Answer(@RequestParam("Answer")String Answer,@RequestParam("Qid")String Qid)
    {

        Question question1 =new Question();
        int rr=Integer.parseInt(Qid);
       question1= questionDaoService.Select(rr);

        String Q =question1.getQuestion();

        Answer answer=new Answer();
        answer.setAnswer(Answer);
        answer.setUser(Current_User);
        answer.setQuestion(Q);
        int t=Integer.parseInt(Qid);
        answer.setQId(t);


        answerDaoService.Insert(answer);

        System.out.println(Qid);
        System.out.println(Answer);
        System.out.println(Current_User);


        int qid= Integer.parseInt(Qid);
        question1 =questionDaoService.Select(qid);
        System.out.println(question1.getQuestion());


        ModelAndView modelAndView =new ModelAndView("Home");
        return modelAndView;

    }

}
