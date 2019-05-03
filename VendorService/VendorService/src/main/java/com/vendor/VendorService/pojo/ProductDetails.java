package com.vendor.VendorService.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_CODE")
	private int productCode;
	@Lob
	@Column(name = "MORE_DESCRIPTION")
	private String moreDescription;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "COMMENT")
	private String comment;
	@Column(name = "HTML_DESCRIPTION")
	private String htmlDescription;
	
	
	public ProductDetails() {
		super();
	}
	public ProductDetails(int productCode, String moreDescription, String image, String comment,
			String htmlDescription) {
		this();
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
	@Override
	public String toString() {
		return "ProductDetails [productCode=" + productCode + ", moreDescription=" + moreDescription + ", image="
				+ image + ", comment=" + comment + ", htmlDescription=" + htmlDescription + "]";
	}
	
	
	
}
