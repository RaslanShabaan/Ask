package Service;

import Dao.RegisterDao;
import Entities.Register;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RegisterDaoSerImpl implements RegisterDaoSer{


    private Dao.RegisterDao registerDao;
    public RegisterDao getRegisterDao() {
        return registerDao;
    }
    public void setRegisterDao(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }

    @Transactional
    public String Insert(Register register) {
        registerDao.Insert(register);
        return "Doen";
    }

    @Transactional
    public String Delete(String UserMail) {

         registerDao.Delete(UserMail);
        return "Doen";
    }

    @Transactional
    public String Update(Register register)
    {
         registerDao.Update(register);
        return "Doen";
    }

    @Transactional
    public Register Select(String UserMail) {
        return registerDao.Select(UserMail);
    }

    @Transactional
    public List<Register> SelectAllUsers() {
        return registerDao.SelectAllUsers();
    }
}
