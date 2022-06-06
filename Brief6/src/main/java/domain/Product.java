package domain;

public class Product {
	
	private int IdProduct;
	private String NomProduct;
	private String NomCategory;
	public Product() {
	}
	public Product(String NomProduct, String NomCategory) {
		this.NomProduct = NomProduct;
		this.NomCategory = NomCategory;
	}
	public  void Category(int IdProduct, String NomProduct, String NomCategory) {
		this.IdProduct = IdProduct;
		this.NomProduct = NomProduct;
		this.NomCategory = NomCategory;

	}
	

}

