package com.vendor.VendorService.Entity;




public class ProductDetailsDto {
	
	private int productCode;
	
	private String moreDescription;
	private String image;
	private String comment;
	private String htmlDescription;
	
	
	
	public ProductDetailsDto(int productCode, String moreDescription, String image, String comment,
			String htmlDescription) {
		super();
		this.productCode = productCode;
		this.moreDescription = moreDescription;
		this.image = image;
		this.comment = comment;
		this.htmlDescription = htmlDescription;
	}
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getMoreDescription() {
		return moreDescription;
	}
	public void setMoreDescription(String moreDescription) {
		this.moreDescription = moreDescription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getHtmlDescription() {
		return htmlDescription;
	}
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	
	
	
}
