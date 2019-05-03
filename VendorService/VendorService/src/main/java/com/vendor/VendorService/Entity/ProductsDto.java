package com.vendor.VendorService.Entity;




public class ProductsDto {
	
	private int productId;
	private ProductDetailsDto productCode;
	private String productName;
	private String productDescription;
	private String productSuggestedUnitPrice;
	private String productBuyUnitPrice;
	private String productInitInStock;
	private String productUnitOnOrder;
	private String productReOrderLevel;
	
	private int supplierId;
	
	
	public ProductsDto() {
		super();
	}
	
	public ProductsDto(int productId, ProductDetailsDto productCode, String productName, String productDescription,
			String productSuggestedUnitPrice, String productBuyUnitPrice, String productInitInStock,
			String productUnitOnOrder, String productReOrderLevel, int supplierId) {
		this();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productSuggestedUnitPrice = productSuggestedUnitPrice;
		this.productBuyUnitPrice = productBuyUnitPrice;
		this.productInitInStock = productInitInStock;
		this.productUnitOnOrder = productUnitOnOrder;
		this.productReOrderLevel = productReOrderLevel;
		this.supplierId = supplierId;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductSuggestedUnitPrice() {
		return productSuggestedUnitPrice;
	}
	public void setProductSuggestedUnitPrice(String productSuggestedUnitPrice) {
		this.productSuggestedUnitPrice = productSuggestedUnitPrice;
	}
	public String getProductBuyUnitPrice() {
		return productBuyUnitPrice;
	}
	public void setProductBuyUnitPrice(String productBuyUnitPrice) {
		this.productBuyUnitPrice = productBuyUnitPrice;
	}
	public String getProductInitInStock() {
		return productInitInStock;
	}
	public void setProductInitInStock(String productInitInStock) {
		this.productInitInStock = productInitInStock;
	}
	public String getProductUnitOnOrder() {
		return productUnitOnOrder;
	}
	public void setProductUnitOnOrder(String productUnitOnOrder) {
		this.productUnitOnOrder = productUnitOnOrder;
	}
	public String getProductReOrderLevel() {
		return productReOrderLevel;
	}
	public void setProductReOrderLevel(String productReOrderLevel) {
		this.productReOrderLevel = productReOrderLevel;
	}
	
	public ProductDetailsDto getProductCode() {
		return productCode;
	}

	public void setProductCode(ProductDetailsDto productCode) {
		this.productCode = productCode;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", productSuggestedUnitPrice="
				+ productSuggestedUnitPrice + ", productBuyUnitPrice=" + productBuyUnitPrice + ", productInitInStock="
				+ productInitInStock + ", productUnitOnOrder=" + productUnitOnOrder + ", productReOrderLevel="
				+ productReOrderLevel + ", supplierId=" + supplierId + "]";
	}
	
	
}