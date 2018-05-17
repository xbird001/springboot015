package springboot010;

import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public void createUser(String name, String password) {
		System.out.println("name = " + name + " password = " + password);
	}

}
