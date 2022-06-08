package impl;


	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import dao.DAO;
import domain.Product;
import view.DBConnect;

	public class ProductDAOImpl  implements DAO  <Product>{
		
		
		@Override
		public Product read(int id) {


			return null;
		}

	//Product
		
	//CREAT 
		@Override
		public boolean create(Product product) throws SQLException {
			String sql = "INSERT INTO Product (IdProduct, ProductName, CategoName, Stock , IdCategory) VALUES (?, ?, ?, ?,?)";
			
			PreparedStatement ps = connect.prepareStatement(sql);
			
	     	            ps.setInt(1, product.getIdProduct());
						ps.setString(2, product.getProductName());
						ps.setString(3, product.getCategoName());
						ps.setInt(4, product.getStock());
						ps.setInt(5, product.getIdCategory());
						
					
						
				
			
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
		public List<Product> getAll() {
			List<Product> ListerProduct = new ArrayList<>();
		try {
			String sql = "SELECT *  FROM Product";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Product product = new Product();
				product.setIdProduct(rs.getInt("IdProduct"));
				product.setProductName(rs.getString("ProductName"));
				product.setCategoName(rs.getString("CategoName"));
				product.setStock(rs.getInt("Stock"));
				product.setIdCategory(rs.getInt("IdCategory"));

				ListerProduct.add(product);
				
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		return ListerProduct;
		}



		public boolean getById(int id)  {
		 try {
			 Statement stmt = connect.createStatement();
			
			 System.out.println(id);
				ResultSet rs = stmt.executeQuery("SELECT *FROM Product WHERE IdProduct ="+ id);
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
		public boolean update(int id, Product product) throws SQLException {
			
			String sql = "UPDATE Product set IdProduct = ?, ProductName = ?, CategoName = ?, Stock = ? , IdCategory = ? where IdProduct = ?";
//			
	
				PreparedStatement ps = connect.prepareStatement(sql);
				
				ps.setInt(1, product.getIdProduct());
				ps.setString(2, product.getProductName());
				ps.setString(3, product.getCategoName());
				ps.setInt(4, product.getStock());
				ps.setInt(5, product.getIdCategory());
				ps.setInt(6, id);
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
		        int i = stmt.executeUpdate("DELETE FROM Product WHERE IdProduct=" + id);

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



