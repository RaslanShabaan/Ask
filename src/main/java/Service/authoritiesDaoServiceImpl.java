package Service;

import Entities.authorities;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class authoritiesDaoServiceImpl implements authoritiesDaoService {

    //authoritiesDao authoritiesDao;
    private Dao.authoritiesDao authoritiesDao;

    public void setAuthoritiesDao(Dao.authoritiesDao authoritiesDao) {
        this.authoritiesDao = authoritiesDao;
    }
    public Dao.authoritiesDao getAuthoritiesDao() {
        return authoritiesDao;
    }

    @Transactional
    public String Insert(authorities authorities) {

        authoritiesDao.Insert(authorities);
        return "Doen";
    }

    @Transactional
    public String Delete(String username) {

        authoritiesDao.Delete(username);
        return "Doen";
    }

    @Transactional
    public String Update(authorities authorities) {

        authoritiesDao.Update(authorities);
        return "Doen";
    }

    @Transactional
    public authorities Select(String username) {

        return authoritiesDao.Select(username);
    }

    @Transactional
    public List<authorities> SelectAllUsers() {

        return authoritiesDao.SelectAllUsers();
    }


}