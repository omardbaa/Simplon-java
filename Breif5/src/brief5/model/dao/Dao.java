package brief5.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import brief5.Connection.DB;
import brief5.domain.Candidat;

public interface Dao<T> {
	
	public 	Connection Connect=DB.getConnection();
	
	

	
	//CREAT
	   public T createCandidat(T cand);
	
	
	
	//READ
	Candidat getById (int id);
	List<brief5.domain.Candidat> getAll();
	
	//Update
	String  update (T item);
	
	
	//DELET
	String  delet (int id);
	String saveAll(List<brief5.domain.Candidat> items);
	String  delet(Candidat item);



	void delete(Candidat cand) throws SQLException;



	void updateCandidat();
	
}
