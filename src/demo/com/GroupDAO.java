package demo.com;

import org.springframework.stereotype.Component;

@Component
public class GroupDAO implements IGroupDAO {

	@Override
	public void getGroupById(int id) {
		
		System.out.print("group id: "+id);
		
	}

}
