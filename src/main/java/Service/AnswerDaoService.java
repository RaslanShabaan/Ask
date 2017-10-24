package Service;


import Entities.Answer;

import java.util.List;

public interface AnswerDaoService {

    public String Insert(Answer  answer);
    public String Delete(int QId);
    public String Update(Answer answer);
    public Answer Select(int QId);
    public List<Answer> SelectAllUsers();

}
