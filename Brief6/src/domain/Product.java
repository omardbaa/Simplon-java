package domain;

public class Product {

	
	private int IdProduct,Stock;
	private String ProductName;
	private  Categories CategoryName;
	
	
	
	
	public Product(int idProduct, int stock, String productName, Categories categoryName) {
	
		this.IdProduct = idProduct;
		this.Stock = 0;
		this.ProductName = productName;
		this.CategoryName = categoryName;
		
		
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
	public Categories getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(Categories categoryName) {
		CategoryName = categoryName;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Product [IdProduct=" + IdProduct + ", Stock=" + Stock + ", ProductName=" + ProductName
				+ ", CategoryName=" + CategoryName + "]";
	}
	
	
	

	
	
	
}


