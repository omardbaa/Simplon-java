package model.Dao;

	
import java.sql.Connection;
import java.util.ArrayList;

import domain.Product;
import view.DBConnect;





	public interface DAO<T> {
		 public Connection connect = DBConnect.getInstance() ;
		    
		    /*
		     * Permet de r�cup�rer un objet via son ID
		     * @param id
		     * @return
		     */
		    public abstract T read(T obj);
		    public abstract T find(long id);
		    
		    /*
		     * Permet de cr�er une entr�e dans la base de donn�es
		     * par rapport � un objet
		     * @param obj
		     */
		    public abstract T create(T obj);
		    
		    /*
		     * Permet de mettre � jour les donn�es d'une entr�e dans la base 
		     * @param obj
		     */
			
			boolean update(int id, T user);

		    
		    /*
		     * Permet la suppression d'une entr�e de la base
		     * @param obj
		     */
		    public boolean delete(int id);
		    
		    
		    
			ArrayList<Product> viewProduct();
			Product add(Product product);
			void updateProduct(Product product, int updateIdProduct);
		

	

	}

