package com.vendor.VendorService.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "PRODUCT")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private int productId;
	@ManyToOne()
	@Cascade(value = { org.hibernate.annotations.CascadeType.ALL })
	@JoinColumn(name = "PRODUCT_CODE", referencedColumnName = "PRODUCT_CODE")
	private ProductDetails productCode;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name = "PRODUCT_SUGGESTED_UNIT_PRICE")
	private String productSuggestedUnitPrice;
	@Column(name = "PRODUCT_BUY_UNIT_PRICE")
	private String productBuyUnitPrice;
	@Column(name = "PRODUCT_INIT_IN_STOCK")
	private String productInitInStock;
	@Column(name = "PRODUCT_UNIT_ON_ORDER")
	private String productUnitOnOrder;
	@Column(name = "PRODUCT_RE_ORDER_LEVEL")
	private String productReOrderLevel;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
	private Suppliers supplierId;
	
	
	public Products() {
		super();
	}
	
	public Products(int productId, ProductDetails productCode, String productName, String productDescription,
			String productSuggestedUnitPrice, String productBuyUnitPrice, String productInitInStock,
			String productUnitOnOrder, String productReOrderLevel, Suppliers supplierId) {
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
	
	public ProductDetails getProductCode() {
		return productCode;
	}
	
	public void setProductCode(ProductDetails productCode) {
		this.productCode = productCode;
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
	
	public Suppliers getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Suppliers supplierId) {
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