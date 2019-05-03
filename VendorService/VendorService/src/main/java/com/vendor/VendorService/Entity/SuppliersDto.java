package com.vendor.VendorService.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class SuppliersDto {
	
	public SuppliersDto(int supplierId, String supplierName, String supplierAddress, String supplierArea,
			String supplierPincode, String supplierCity, String supplierCountry, String supplierMobileNo,
			String supplierOfficeNo, String supplierEmailId, String supplierFax) {
		super();
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
	}
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private String supplierArea;
	private String supplierPincode;
	private String supplierCity;
	private String supplierCountry;
	private String supplierMobileNo;
	private String supplierOfficeNo;
	private String supplierEmailId;
	private String supplierFax;
	
	public int getSupplierId() {
		return supplierId;
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
}
