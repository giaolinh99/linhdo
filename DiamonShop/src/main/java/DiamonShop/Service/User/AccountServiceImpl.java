package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.UsersDao;
import DiamonShop.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	UsersDao usersDao = new UsersDao();
	
	public int AddAccount(Users user) {
		user.setPasssword(BCrypt.hashpw(user.getPasssword(), BCrypt.gensalt(12)));
		return usersDao.AddAccount(user);
	}


	public Users CheckAccount(Users user) {
		String pass = user.getPasssword();
 		user = usersDao.GetUserByAcc(user);
		if(user != null) {
			if(BCrypt.checkpw(pass, user.getPasssword())) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}

}
