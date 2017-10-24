package Service;

import Dao.QuestionDao;
import Entities.Question;
import Entities.authorities;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDaoServiceImpl implements QuestionDaoService {

    QuestionDao questionDao;
    public QuestionDao getQuestionDao() {return questionDao;}
    public void setQuestionDao(QuestionDao questionDao) {this.questionDao = questionDao;}

    @Transactional
    public String Insert(Question question) {
        return questionDao.Insert(question);
    }

    @Transactional
    public String Delete(int QId) {
        return questionDao.Delete(QId);
    }

    @Transactional
    public String Update(Question question) {
        return questionDao.Update(question);
    }

    @Transactional
    public Question Select(int QId) {
        return questionDao.Select(QId);
    }

    @Transactional
    public List<Question> SelectAllUsers() {
        return questionDao.SelectAllUsers();
    }

    @Transactional
    public ArrayList<String> Select_U_Questions(String User) {

        return questionDao.Select_U_Questions(User);
    }
}
