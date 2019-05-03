package com.vendor.VendorService.pojo;



import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "SUPPLIER")
public class Suppliers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUPPLIER_ID")
	private int supplierId;
	@Column(name = "SUPPLIER_NAME")
	private String supplierName;
	@Column(name = "SUPPLIER_ADDRESS")
	private String supplierAddress;
	@Column(name = "SUPPLIER_AREA")
	private String supplierArea;
	@Column(name = "SUPPLIER_PINCODE")
	private String supplierPincode;
	@Column(name = "SUPPLIER_CITY")
	private String supplierCity;
	@Column(name = "SUPPLIER_COUNTRY")
	private String supplierCountry;
	@Column(name = "SUPPLIER_MOBILE_NO")
	private String supplierMobileNo;
	@Column(name = "SUPPLIER_OFFICE_NO")
	private String supplierOfficeNo;
	@Column(name = "SUPPLIER_EMAIL_ID")
	private String supplierEmailId;
	@Column(name = "SUPPLIER_SUPPLIER_FAX")
	private String supplierFax;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierId")
	private List<Products> products;
	
	public int getSupplierId() {
		return supplierId;
	}
	public Suppliers(int supplierId, String supplierName, String supplierAddress, String supplierArea,
			String supplierPincode, String supplierCity, String supplierCountry, String supplierMobileNo,
			String supplierOfficeNo, String supplierEmailId, String supplierFax, List<Products> products) {
		this();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplierArea = supplierArea;
		this.supplierPincode = supplierPincode;
		this.supplierCity = supplierCity;
		this.supplierCountry = supplierCountry;
		this.supplierMobileNo = supplierMobileNo;
		this.supplierOfficeNo = supplierOfficeNo;
		this.supplierEmailId = supplierEmailId;
		this.supplierFax = supplierFax;
		this.products = products;
	}
	public Suppliers() {
		super();
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public String getSupplierArea() {
		return supplierArea;
	}
	public void setSupplierArea(String supplierArea) {
		this.supplierArea = supplierArea;
	}
	public String getSupplierPincode() {
		return supplierPincode;
	}
	public void setSupplierPincode(String supplierPincode) {
		this.supplierPincode = supplierPincode;
	}
	public String getSupplierCity() {
		return supplierCity;
	}
	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}
	public String getSupplierCountry() {
		return supplierCountry;
	}
	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}
	public String getSupplierMobileNo() {
		return supplierMobileNo;
	}
	public void setSupplierMobileNo(String supplierMobileNo) {
		this.supplierMobileNo = supplierMobileNo;
	}
	public String getSupplierOfficeNo() {
		return supplierOfficeNo;
	}
	public void setSupplierOfficeNo(String supplierOfficeNo) {
		this.supplierOfficeNo = supplierOfficeNo;
	}
	public String getSupplierEmailId() {
		return supplierEmailId;
	}
	public void setSupplierEmailId(String supplierEmailId) {
		this.supplierEmailId = supplierEmailId;
	}
	public String getSupplierFax() {
		return supplierFax;
	}
	public void setSupplierFax(String supplierFax) {
		this.supplierFax = supplierFax;
	}
	
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Suppliers [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", supplierArea=" + supplierArea + ", supplierPincode=" + supplierPincode
				+ ", supplierCity=" + supplierCity + ", supplierCountry=" + supplierCountry + ", supplierMobileNo="
				+ supplierMobileNo + ", supplierOfficeNo=" + supplierOfficeNo + ", supplierEmailId=" + supplierEmailId
				+ ", supplierFax=" + supplierFax + ", products=" + "]";
	}
	
	
}
