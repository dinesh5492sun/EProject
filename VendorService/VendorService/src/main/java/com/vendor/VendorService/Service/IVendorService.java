package com.vendor.VendorService.Service;

import java.util.List;

import com.vendor.VendorService.Entity.ProductsDto;
import com.vendor.VendorService.Entity.SuppliersDto;

public interface IVendorService {
	
	public List<SuppliersDto> getSuppliers();
	public List<ProductsDto> getSupplierProducts(int supplierId);
}
