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
	
	
	
	
	
	
	@Override
	public int update(Candidat candid) throws SQLException {
		Connection connection = DB.getConnection();

		String sql = ("UPDATE Candidat SET ,Nom_Candidat =? ,Prenom_Candidat =?,Email_Candidat =? ,Password_Candidat =? ,Adresse_Candidat =?, Ville_Candidat =? ,Pays_Candidat =? WHERE ID_Candidat= ?)");
		
		PreparedStatement P_S = connection.prepareStatement(sql);
		P_S.setInt(1, candid.getIdCandidat());
		P_S.setString(2,candid.getNomCandidat() );
		P_S.setString(3,candid.getPrenomCandidat() );
		P_S.setString(4,candid.getEmailCandidat());
		P_S.setString(5, candid.getPassWordCandidat());
		P_S.setString(6, candid.getAdresseCandidat());
		P_S.setString(7, candid.getVille_Candidat());
		P_S.setString(8, candid.getPaysCandidat());
		
		int result = P_S.executeUpdate();
		
		P_S.close();
		Connect.close();
		
		return result;
	}
	
	/*
	 * public updateCandidat( Candidat candid) throws ClassNotFoundException {
	 * Connection connection = DB.getConnection();
	 * 
	 * 
	 * String sql =
	 * ("UPDATE Candidat SET ,Nom_Candidat =? ,Prenom_Candidat =?,Email_Candidat =? ,Password_Candidat =? ,Adresse_Candidat =?, Ville_Candidat =? ,Pays_Candidat =? WHERE ID_Candidat= ?)"
	 * ); try { PreparedStatement P_S = Connect.prepareStatement(sql); P_S.setInt(1,
	 * candid.getIdCandidat()); P_S.setString(2,candid.getNomCandidat() );
	 * P_S.setString(3,candid.getPrenomCandidat() );
	 * P_S.setString(4,candid.getEmailCandidat()); P_S.setString(5,
	 * candid.getPassWordCandidat()); P_S.setString(6, candid.getAdresseCandidat());
	 * P_S.setString(7, candid.getVille_Candidat()); P_S.setString(8,
	 * candid.getPaysCandidat()); P_S.execute(); P_S.setInt(5, Id_candidat);
	 * 
	 * int i = P_S.executeUpdate(); if(i == 1) { return true; } P_S.close();
	 * Connect.close();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return false; }
	 */
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

		
		
	}
	
	
	
	/*
	 * public Candidat update1(Candidat candid){ String sql =
	 * "UPDATE  Candidat set  ,Nom_Candidat =? ,Prenom_Candidat =?,Email_Candidat =? ,Password_Candidat =? ,Adresse_Candidat =?, Ville_Candidat =? ,Pays_Candidat =? WHERE ID_Candidat= ?"
	 * ;
	 * 
	 * try( Connection connection = DB.getConnection(); PreparedStatement P_S =
	 * Connect.prepareStatement(sql);){
	 * 
	 * P_S.setInt(1, candid.getIdCandidat());
	 * P_S.setString(2,candid.getNomCandidat() );
	 * P_S.setString(3,candid.getPrenomCandidat() );
	 * P_S.setString(4,candid.getEmailCandidat()); P_S.setString(5,
	 * candid.getPassWordCandidat()); P_S.setString(6, candid.getAdresseCandidat());
	 * P_S.setString(7, candid.getVille_Candidat()); P_S.setString(8,
	 * candid.getPaysCandidat()); P_S.execute();
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } return candid;
	 * 
	 * 
	 * 
	 * }
	 */

	
	
	
	
	


	@Override
	public List<Candidat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	




	public void updateCandidat() {
		// TODO Auto-generated method stub
		
	}





	



	public Candidat get(int i) {
		// TODO Auto-generated method stub
		return null;
	}




	




	public Candidat View(long id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int save(Candidat t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}




	




	@Override
	public int delete(Candidat t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}









	
	


}
