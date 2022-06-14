package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnect;
import domain.Candidat;


public class CandidatDAO implements DAO<Candidat> {	
	
	



		@Override
		public Candidat read(int id) {


			return null;
		}

		
		
		//CREAT Candidat
		@Override
		public boolean create(Candidat candidat) throws SQLException {
			String sql = "INSERT INTO Candidat (IdCandidat, NomCandidat, PrenomCandidat, EmailCandidat, AdresseCandidat, VilleCandidat, PaysCandidat) VALUES (?, ?, ?, ?,?,?,?)";
			
			PreparedStatement ps = connect.prepareStatement(sql);
			
	     	            ps.setInt(1, candidat.getIdCandidat());
						ps.setString(2, candidat.getNomCandidat());
						ps.setString(3, candidat.getPrenomCandidat());
						ps.setString(4, candidat.getEmailCandidat());
						ps.setString(5, candidat.getAdresseCandidat());
						ps.setString(6, candidat.getVilleCandidat());
						ps.setString(7, candidat.getPaysCandidat());
		  
					
		int result = ps.executeUpdate();
		
		if(result == 1) {
			return  true;
		}
			
						DBConnect.closePreparedStatement(ps);
						DBConnect.closeConnection(connect);
						
			return false;
			
		}
		
		//Read

		@Override
	public List<Candidat> getAll() {
			List<Candidat> ListerCandidats = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM Candidat";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Candidat candidat = new Candidat();
				candidat.setIdCandidat(rs.getInt("IdCandidat"));
				candidat.setNomCandidat(rs.getString("NomCandidat"));
				candidat.setPrenomCandidat(rs.getString("PrenomCandidat"));
				candidat.setEmailCandidat(rs.getString("EmailCandidat"));
				candidat.setAdresseCandidat(rs.getString("AdresseCandidat"));
				candidat.setVilleCandidat(rs.getString("VilleCandidat"));
				candidat.setPaysCandidat(rs.getString("PaysCandidat"));
				ListerCandidats.add(candidat);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerCandidats;
		}




	public boolean getById(int id) {
		
			
			try {
				Statement stmt = connect.createStatement();
		
		
			System.out.println(id);
			ResultSet rs = stmt.executeQuery("SELECT *FROM Candidat WHERE IdCandidat ="+ id);
				 if (rs.next()) {
						

					return true;
				 }
				 
			}catch (Exception e) {
				e.printStackTrace();
			}

		

			return false;
		}
	
	
    //Update
		@Override
		public boolean update(int id, Candidat candidat) throws SQLException {
			

	
				String sql = "UPDATE Candidat set IdCandidat = ?, NomCandidat = ?, PrenomCandidat = ?, EmailCandidat = ?, AdresseCandidat = ? , VilleCandidat = ?  , PaysCandidat = ? where IdCandidat = ?";
				
				PreparedStatement ps = connect.prepareStatement(sql);
				
				ps.setInt(1, candidat.getIdCandidat());
				ps.setString(2, candidat.getNomCandidat());
				ps.setString(3, candidat.getPrenomCandidat());
				ps.setString(4, candidat.getEmailCandidat());
				ps.setString(5, candidat.getAdresseCandidat());
				ps.setString(6, candidat.getVilleCandidat());
				ps.setString(7, candidat.getPaysCandidat());
				ps.setInt(8, id);
				int result = ps.executeUpdate();

				
				if(result == 1) {
					return  true;
				}
					
								DBConnect.closePreparedStatement(ps);
								DBConnect.closeConnection(connect);
								
					return false;
					
				}
	

	//Delete
	
		@Override
		 public boolean delete(int id) {

		    try {
		        Statement stmt = connect.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM Candidat WHERE IdCandidat=" + id);

		      if(i == 1) {
		        return true;
		      }
			    stmt.close();
			    connect.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return false;
		}	

}
