package Service;


import Entities.Register;

import java.util.List;

public interface RegisterDaoSer {

    public String Insert(Register register);
    public String Delete(String UserMail);
    public String Update(Register register);
    public Register Select(String UserMail);
    public List<Register> SelectAllUsers();

}
