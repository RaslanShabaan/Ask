package Service;

import Entities.Question;
import Entities.authorities;

import java.util.ArrayList;
import java.util.List;

public interface QuestionDaoService {


    public String Insert(Question question);
    public String Delete(int QId);
    public String Update(Question question);
    public Question Select(int QId);
    public List<Question> SelectAllUsers();

    public ArrayList<String> Select_U_Questions(String User);

}

