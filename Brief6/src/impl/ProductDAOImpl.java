//package impl;
//
//
//	import java.sql.Connection;
//	import java.sql.PreparedStatement;
//	import java.sql.ResultSet;
//	import java.sql.SQLException;
//	import java.sql.Statement;
//	import java.util.ArrayList;
//	import java.util.List;
//
//import dao.DAO;
//import domain.Product;
//import view.DBConnect;
//
//	public abstract class ProductDAOImpl {
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//
//		@Override
//		public Product read(Product obj) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Product find(long id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Product create(Product obj) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public boolean update(int id, Product user) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public boolean delete(int id) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public ArrayList<Product> viewProduct() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Product add(Product product) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public void updateProduct(Product product, int updateIdProduct) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		
//		
//		
//		private static final int IdProduct = 0;
//
//		// CRUD - Retrieve
//		
//			@Override
//			public Product get(int id) throws SQLException {
//				Connection con = DBConnect.getConnection();
//				Product Product = null;
//
//				
//
//				String sql = "SELECT IdProduct, ProductName, CategoName, Stock , IdCategory FROM Product WHERE IdProduct = ?";
//
//				PreparedStatement ps = con.prepareStatement(sql);
//
//				ps.setInt(1, IdProduct);
//
//				ResultSet rs = ps.executeQuery();
//
//				if (rs.next()) {
//					int IdProduct = rs.getInt("IdProduct");
//					String ProductName = rs.getString("ProductName");
//					String CategoName = rs.getString("CategoName");
//					int Stock = rs.getInt("Stock");
//					int IdCategory = rs.getInt("IdCategory");
//				
//					
//
//					Product = new Product(IdProduct, ProductName, CategoName, Stock, IdCategory);
//				}
//
//				DBConnect.closeResultSet(rs);
//				DBConnect.closePreparedStatement(ps);
//				DBConnect.closeConnection(con);
//
//				return Product;
//			}
//
//			// CRUD - Retrieve All
//			
//			@Override
//			public List<Product> getAllProducts() throws SQLException {
//
//				Connection con = DBConnect.getConnection();
//				String sql = "SELECT IdProduct, ProductName, CategoName, Stock, IdCategory FROM Product";
//
//				List<Product> products = new ArrayList<>();
//
//				Statement stmt = con.createStatement();
//
//				ResultSet rs = stmt.executeQuery(sql);
//
//				while (rs.next()) {
//					int IdProduct = rs.getInt("IdProduct");
//					String ProductName = rs.getString("ProductName");
//					String CategoName = rs.getString("CategoName");
//					int Stock = rs.getInt("Stock");
//					int IdCategory = rs.getInt("IdCategory");
//				
//
//					Product product= new Product(IdProduct, ProductName, CategoName, Stock, IdCategory);
//					products.add(product);
//				}
//
//				return products;
//			}
//
//			// CRUD - Create or Update
//			
//			@Override
//			public int saveProduct(Product product) throws SQLException {
//			
//				return 0;
//			}
//
//			// CRUD - Create
//
//			@Override
//			public int insertProduct(Product product) throws SQLException {
//				Connection con = DBConnect.getConnection();
//
//				String sql = "INSERT INTO Users (IdProduct, ProductName, CategoName, Stock, IdCategory) VALUES (?, ?, ?, ?, ?)";
//
//				PreparedStatement ps = con.prepareStatement(sql);
//
//				ps.setInt(1, product.getIdProduct());
//				ps.setString(2, product.getProductName());
//				ps.setString(3, product.getCategoName());
//				ps.setInt(4, product.getStock());
//				ps.setInt(4, product.getIdCategory());
//				
//				
//
//				int result = ps.executeUpdate();
//
//				DBConnect.closePreparedStatement(ps);
//				DBConnect.closeConnection(con);
//
//				return result;
//			}
//
//			// CRUD - Update
//		
//			@Override
//			public int updateProduct(Product product) throws SQLException {
//				Connection connection = DBConnect.getConnection();
//
//				String sql = "UPDATE Product set IdProduct = ?, ProductName = ?, CategoName = ?, Stock = ? , IdCategory = ? where UserId = ?";
//				
//				PreparedStatement ps = connection.prepareStatement(sql);
//				
//				ps.setInt(1, product.getIdProduct());
//				ps.setString(2, product.getProductName());
//				ps.setString(3, product.getCategoName());
//				ps.setInt(4, product.getStock());
//				ps.setInt(4, product.getIdCategory());
//				int result = ps.executeUpdate();
//				
//				DBConnect.closePreparedStatement(ps);
//				DBConnect.closeConnection(connection);
//				
//				return result;
//			}
//
//			// CRUD - Delete
//		
//			@Override
//			public int deleteProduct(Product product) throws SQLException {
//			
//				return 0;
//			}
//
//		
//	}
//
//
//
