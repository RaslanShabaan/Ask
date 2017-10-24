package Service;


import Entities.authorities;

import java.util.List;

public interface authoritiesDaoService {


    public String Insert(authorities authorities);
    public String Delete(String username);
    public String Update(authorities authorities);
    public authorities Select(String username);
    public List<authorities> SelectAllUsers();

}
