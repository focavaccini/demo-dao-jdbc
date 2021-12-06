package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.fingByDepartment(dep);
		
		for(Seller sellers : list) {
			System.out.println(sellers);
		}
	}
}
