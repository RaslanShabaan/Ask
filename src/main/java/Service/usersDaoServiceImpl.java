package Service;

import Entities.users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class usersDaoServiceImpl implements usersDaoService {

    private Dao.usersDao usersDao;

    public void setUsersDao(Dao.usersDao usersDao) {
        this.usersDao = usersDao;
    }
    public Dao.usersDao getUsersDao() {
        return usersDao;
    }


    @Transactional
    public String Insert(users users) {

        usersDao.Insert(users);
        return "Doen";
    }

    @Transactional
    public String Delete(String username) {

        usersDao.Delete(username);
        return "Doen";
    }

    @Transactional
    public String Update(users users) {

        usersDao.Update(users);
        return "Doen";
    }

    @Transactional
    public users Select(String username) {

        return   usersDao.Select(username);
    }


    @Transactional
    public List<users> SelectAllUsers() {

        return usersDao.SelectAllUsers();
    }

    public users SelectByVcode(String V_Code) {
        return usersDao.Select(V_Code);
    }

}
