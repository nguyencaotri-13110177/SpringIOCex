package demo.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		UserService userService = (UserService) context.getBean("userService");
//		userService.getUserById(12);
		
//		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
//		userDAO.getUserById(12);
		
//		GroupDAO groupDAO = (GroupDAO) context.getBean("groupDAO");
//		groupDAO.getGroupById(12);
		
//		Controller controller = (Controller) context.getBean("controller");
//		controller.getGroupById(12);
		
//		UserDAO userDAO=new UserDAO();
//		UserService userService=new UserService();
//		userService.setUserDAO(userDAO);
//		userService.getUserById(12);
		
		IGroupDAO iGroupDAO=new GroupDAO();
				
		Controller controller =new Controller();
		controller.setiGroupDAO(iGroupDAO);
		controller.getGroupById(19);

	}

}
