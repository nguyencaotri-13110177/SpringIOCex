package demo.com;

import org.springframework.stereotype.Component;

@Component
public interface IGroupDAO {
	
	void getGroupById(int id);

}
