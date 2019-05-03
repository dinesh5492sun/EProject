package com.vendor.VendorService.mapper;

import com.vendor.VendorService.Entity.ProductsDto;
import com.vendor.VendorService.pojo.Products;

public class ProductMapper {

	public static Products convertToProduct(ProductsDto suppliersDto) {
		return null;
	}

	public static ProductsDto convertToProductDto(Products suppliers) {
		
		return new ProductsDto(suppliers.getProductId(), ProductDetailsMapper.convertToProductDetailsDto(suppliers.getProductCode()), suppliers.getProductName(),suppliers.getProductDescription(),
				suppliers.getProductSuggestedUnitPrice(),suppliers.getProductBuyUnitPrice(),suppliers.getProductInitInStock(),
				suppliers.getProductUnitOnOrder(),suppliers.getProductReOrderLevel(),suppliers.getSupplierId().getSupplierId());
		//SuppliersMapper.convertToSupplierDto(suppliers.getSupplierId())
	}
}
