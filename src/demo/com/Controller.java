package demo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	public IGroupDAO iGroupDAO;
	
	
	public void setiGroupDAO(IGroupDAO iGroupDAO) {
		this.iGroupDAO = iGroupDAO;
	}



	public void getGroupById(int id)
	{
		iGroupDAO.getGroupById(id);
	}
	

}
