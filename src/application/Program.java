package application;

import java.util.Date;
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
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller sellers : list) {
			System.out.println(sellers);
		}
		
		System.out.println("--------------------");
		List<Seller> listAll = sellerDao.findAll();
		
		for(Seller sellers : listAll) {
			System.out.println(sellers);
		}
		System.out.println("--------------------");
		Seller newSeller = new Seller(null, "Fernando", "fernandocavaccini@gmail.com", new Date(), 3000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Id: " + newSeller.getId());
		for(Seller sellers : listAll) {
			System.out.println(sellers);
		}
		
		System.out.println("--------------------");
		seller = sellerDao.findById(8);
		seller.setEmail("fernando@gmail.com");
		sellerDao.update(seller);
		for(Seller sellers : listAll) {
			System.out.println(sellers);
		}
		
		System.out.println("--------------------");
		int id = 8;
		sellerDao.deleteById(id);
	}
}
