package domain;

public class Product {

	
	private int IdProduct, Stock, IdCategory ;
	private String ProductName;
	private  String CategoName;
	
	
	
	
	public Product(int idProduct,  String productName, String categoName,int stock, int idCategory) {
	
		this.IdProduct = idProduct;
		this.Stock = 0;
		this.ProductName = "";
		this.CategoName = categoName;
		this.IdCategory = idCategory;
		
		
	}
	
	
	public Product(Product product) {
		this.IdProduct = product.IdProduct;
		this.ProductName = product.ProductName;
		this.CategoName = product.CategoName;
		this.Stock = product.Stock;
		this.IdCategory = product.IdCategory;
	}
	
	
	public int getIdCategory() {
		return IdCategory;
	}


	public void setIdCategory(int idCategory) {
		IdCategory = idCategory;
	}


	public int getIdProduct() {
		return IdProduct;
	}
	public void setIdProduct(int idProduct) {
		IdProduct = idProduct;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public void setCategoName(String categoName) {
		CategoName = categoName;
		}
		
		public String getCategoName() {
		return CategoName;
	
	
	}
	
	
	
	
	@Override
	public String toString() {
		return "Product [IdProduct=" + IdProduct + ", Stock=" + Stock + ",  IdCategory=" + IdCategory + " , ProductName=" + ProductName
				+ ", CategoName=" + CategoName + "]";
	}
	
	
	

	
	
	
}


