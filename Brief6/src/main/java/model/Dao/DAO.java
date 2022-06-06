package model.Dao;

	
	import java.sql.Connection;
	import java.util.ArrayList;

import domain.Product;
import model.DB.DB;





	public interface DAO<T> {
		 public Connection connect = DB.getInstance();
		    
		    /*
		     * Permet de récupérer un objet via son ID
		     * @param id
		     * @return
		     */
		    public abstract T read(T obj);
		    public abstract T find(long id);
		    
		    /*
		     * Permet de créer une entrée dans la base de données
		     * par rapport à un objet
		     * @param obj
		     */
		    public abstract T create(T obj);
		    
		    /*
		     * Permet de mettre à jour les données d'une entrée dans la base 
		     * @param obj
		     */
			
			boolean update(int id, T user);

		    
		    /*
		     * Permet la suppression d'une entrée de la base
		     * @param obj
		     */
		    public boolean delete(int id);
		    
		    
		    
			ArrayList<Product> voirProduit();
			Product ajouter(Product produit);
			void modifierProduit(Product product, int IdProduitAModifier);
		



	}

}
