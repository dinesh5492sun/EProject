package com.vendor.VendorService.mapper;

import com.vendor.VendorService.Entity.ProductDetailsDto;
import com.vendor.VendorService.pojo.ProductDetails;

public class ProductDetailsMapper {

	public static ProductDetails convertToProductDetails(ProductDetailsDto suppliersDto) {
		return null;
	}

	public static ProductDetailsDto convertToProductDetailsDto(ProductDetails suppliers) {
		
		return new ProductDetailsDto(suppliers.getProductCode(), suppliers.getMoreDescription(),suppliers.getImage(),suppliers.getComment(),
				suppliers.getHtmlDescription());
	}
}
