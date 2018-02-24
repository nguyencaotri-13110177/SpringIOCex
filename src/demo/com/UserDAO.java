package demo.com;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	public void getUserById(int id)
	{
		System.out.print("user id: "+id);
	}

}
