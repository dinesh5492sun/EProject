package com.vendor.VendorService.mapper;

import com.vendor.VendorService.Entity.SuppliersDto;
import com.vendor.VendorService.pojo.Suppliers;

public class SuppliersMapper {

	public static Suppliers convertToSupplier(SuppliersDto suppliersDto) {
		return null;
	}

	public static SuppliersDto convertToSupplierDto(Suppliers suppliers) {
		return new SuppliersDto(suppliers.getSupplierId(), suppliers.getSupplierName(), suppliers.getSupplierAddress(),
				suppliers.getSupplierArea(), suppliers.getSupplierPincode(), suppliers.getSupplierCity(),
				suppliers.getSupplierCountry(), suppliers.getSupplierMobileNo(), suppliers.getSupplierOfficeNo(),
				suppliers.getSupplierEmailId(), suppliers.getSupplierFax());
	}
}
