package brief5.model.dao.Implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import brief5.Connection.DB;
import brief5.domain.Candidat;
import brief5.model.dao.Dao;

public class CandidatDao implements Dao<Candidat> {

	@Override
	public Candidat createCandidat(Candidat cand) {

		try {

			String sql = "INSERT INTO  Candidat(ID_Candidat,Nom_Candidat,Prenom_Candidat,Email_Candidat,Password_Candidat,Adresse_Candidat,Ville_Candidat,Pays_Candidat) values(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement P_S = Connect.prepareStatement(sql);
			Connect.setAutoCommit(false);
			
			P_S.setInt(1, cand.getIdCandidat());
			P_S.setString(2,cand.getNomCandidat() );
			P_S.setString(3,cand.getPrenomCandidat() );
			P_S.setString(4,cand.getEmailCandidat());
			P_S.setString(5, cand.getPassWordCandidat());
			P_S.setString(6, cand.getAdresseCandidat());
			P_S.setString(7, cand.getVille_Candidat());
			P_S.setString(8, cand.getPaysCandidat());
			P_S.execute();
			Connect.commit();
			P_S.close();
			Connect.close();
			System.out.print("bien inseree");
			return cand;
			

		

		

		} catch (Exception e) {

			e.printStackTrace();
		}
		return cand;

	}
	
	
	
	
	public void delete(Integer candid){
		
		String sql = "DELETE FROM Candidat WHERE Id_candidat = ?;";
		try(
				Connection connection = DB.getConnection();	
		PreparedStatement P_S = Connect.prepareStatement(sql);
/*		Connect.setAutoCommit(false);*/){
		
		P_S.setInt(1,candid);
		P_S.executeUpdate();
		

		
		//	Connection connection = DB.getConnection();
			
		//	DB.closePreparedStatement(P_S);
			//DB.closeConnection(connection);
			
		
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	//	return cand;

	}
		
	
	
	
	
	
	
	
	
	

	@Override
	public Candidat getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public String delet(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveAll(List<Candidat> items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delet(Candidat item) {
		// TODO Auto-generated method stub
		return null;
	}




	public void updateCandidat() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String update(Candidat item) {
		// TODO Auto-generated method stub
		return null;
	}




	public Candidat get(int i) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void delete(Candidat cand) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	


}
