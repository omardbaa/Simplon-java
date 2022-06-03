package brief5.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import brief5.Connection.DB;

public interface Dao<T> {
	
	public 	Connection Connect=DB.getConnection();
	
	

	


	   public T createCandidat(T cand);
	
	
		/*
		 * //READ Candidat getById (int id); List<brief5.domain.Candidat> getAll();
		 * 
		 * //Update
		 * 
		 * 
		 * boolean updateCandidat(int Id_candidat, Candidat candid) throws
		 * ClassNotFoundException;
		 * 
		 * 
		 * 
		 * //DELET String delet (int id); String saveAll(List<brief5.domain.Candidat>
		 * items); String delet(Candidat item);
		 * 
		 * 
		 * 
		 * void delete(Candidat cand) throws SQLException;
		 */



	
	T get(int id) throws SQLException;

	List<T> getAll() throws SQLException;

	int save(T t) throws SQLException;

	int update(T t) throws SQLException;

	int delete(T candid) throws SQLException;
	
	
	
	


	
}
