package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("--------------------");
		List<Department> listAll = departmentDao.findAll();
		
		for(Department deps : listAll) {
			System.out.println(deps);
		}
		
		/*
		 * System.out.println("--------------------"); Department newDepartment = new
		 * Department(null, "Construção"); departmentDao.insert(newDepartment);
		 * System.out.println("Id: " + newDepartment.getId());
		 */
		
		/*
		 * System.out.println("--------------------"); dep = departmentDao.findById(5);
		 * dep.setName("Livraria"); departmentDao.update(dep);
		 */
		
		System.out.println("--------------------");
		int id = 5;
		departmentDao.deleteById(id);
	}

}
