package Service;


import Dao.AnswerDao;
import Entities.Answer;
import Entities.Question;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AnswerDaoServiceImpl implements  AnswerDaoService{

    AnswerDao answerDao;

    public AnswerDao getAnswerDao() {return answerDao;}
    public void setAnswerDao(AnswerDao answerDao) {this.answerDao = answerDao;}

    @Transactional
    public String Insert(Answer  answer) {
        return answerDao.Insert(answer);
    }

    @Transactional
    public String Delete(int QId) {
        return answerDao.Delete(QId);
    }

    @Transactional
    public String Update(Answer answer) {
        return answerDao.Update(answer);
    }

    @Transactional
    public Answer Select(int QId) {
        return answerDao.Select(QId);
    }

    @Transactional
    public List<Answer> SelectAllUsers() {
        return answerDao.SelectAllUsers();
    }
}
