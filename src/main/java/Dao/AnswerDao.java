package Dao;

import Entities.Answer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RESO on 10/18/2017.
 */

public interface AnswerDao {
    public String Insert(Answer answer);
    public String Delete(int QId);
    public String Update(Answer  answer);
    public Answer Select(int QId);
    public List<Answer> SelectAllUsers();

}
