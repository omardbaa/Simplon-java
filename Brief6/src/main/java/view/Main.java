package view;

import domain.dao.UsersDAO;
import model.Dao.Impl.CategoryDAOImpl;
import model.Dao.Impl.ProductDAOImpl;
import model.Dao.Impl.UserDAOImpl;

public class Main {

	public static void main(String[] args) {
		
		
        UserDAOImpl userDao =  new UserDAOImpl();
        ProductDAOImpl productDao =  new ProductDAOImpl();
        CategoryDAOImpl categoryDao =  new CategoryDAOImpl();

	}

}
