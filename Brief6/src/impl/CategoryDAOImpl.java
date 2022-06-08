package impl;




	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import dao.DAO;
import domain.Categories;
import view.DBConnect;

	public class CategoryDAOImpl  implements DAO  <Categories>{
		
		
		@Override
		public Categories read(int id) {


			return null;
		}

	//category
		
	//CREAT 
		@Override
		public boolean create(Categories category) throws SQLException {
			String sql = "INSERT INTO Categories (IdCategory, CategoryName) VALUES (?, ?)";
			
			PreparedStatement ps = connect.prepareStatement(sql);
			
	     	            ps.setInt(1, category.getIdCategory());
						ps.setString(2, category.getCategoryName());
						;
						
					
						
				
			
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
		public List<Categories> getAll() {
			List<Categories> Listercategory = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM Categories";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Categories category = new Categories();
				category.setIdCategory(rs.getInt("Idcategory"));
				category.setCategoryName(rs.getString("CategoryName"));
				

				Listercategory.add(category);
				
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return Listercategory;
		}



		public boolean getById(int id)  {
		 try {
			 Statement stmt = connect.createStatement();
			
			 System.out.println(id);
				ResultSet rs = stmt.executeQuery("SELECT *FROM Categories WHERE IdCategory ="+ id);
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
		public boolean update(int id, Categories category) throws SQLException {
			
			String sql = "UPDATE Categories set Idcategory = ?, CategoryName = ?  where IdCategory = ?";
//			
	
				PreparedStatement ps = connect.prepareStatement(sql);
				
				ps.setInt(1, category.getIdCategory());
				ps.setString(2, category.getCategoryName());
			
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
		        int i = stmt.executeUpdate("DELETE FROM Categories WHERE IdCategory=" + id);

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


