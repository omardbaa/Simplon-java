package model;

public class Categories {

	private int IdCategory;
	private String CategoryName;
	
	
	
	
	
	
	
	
	
	
	public Categories() {
		super();
	}




	public Categories(int idCategory, String categoryName) {
		super();
		this.IdCategory = idCategory;
		this.CategoryName = categoryName;
	}
	
	
	
	
	public int getIdCategory() {
		return IdCategory;
	}
	public void setIdCategory(int idCategory) {
		IdCategory = idCategory;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Categories [IdCategory=" + IdCategory + ", CategoryName=" + CategoryName + "]";
	}




	
	
	
	
	
	
	
}
