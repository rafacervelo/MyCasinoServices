package test.daotest;

import java.util.List;

import com.rcd.webcasino.dao.EmpleadoDAO;
import com.rcd.webcasino.model.User;

public class EmpleadoDAOTest {
	
	private EmpleadoDAO dao = null;
	
	public EmpleadoDAOTest() {
		dao = new EmpleadoDAO();		
	}
	
	public void testFindById() 
		throws Exception {
		User u = dao.findById(101);
		System.out.println(u);
	}
	
	public void testFindByNombre() 
		throws Exception {
		List<User> users = dao.findByNombre("a", "b");
		for (User u:users) {
			System.out.println(u);
		}
		
	}
	
	
	public static void main(String args[]) {
		try {
			EmpleadoDAOTest test = new EmpleadoDAOTest();
			test.testFindById();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
