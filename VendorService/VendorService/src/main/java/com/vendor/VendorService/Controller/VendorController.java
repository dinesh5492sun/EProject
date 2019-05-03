package com.vendor.VendorService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendor.VendorService.Entity.ProductsDto;
import com.vendor.VendorService.Entity.SuppliersDto;
import com.vendor.VendorService.Service.IVendorService;

@RestController
@RequestMapping("/suppliers")
public class VendorController {
	
	@Autowired
	IVendorService ivendorService;
	
	@GetMapping
	public ResponseEntity<List<SuppliersDto>> getSuppliers() {
		List<SuppliersDto> suppliers=ivendorService.getSuppliers();
		return new ResponseEntity<List<SuppliersDto>>(suppliers,HttpStatus.OK);
	}
	
	
	@GetMapping("/{supplierId}")
	public ResponseEntity<List<ProductsDto>> getSupplierProducts(@PathVariable("supplierId") int supplierId) {
		List<ProductsDto> products=ivendorService.getSupplierProducts(supplierId);
		
		return new ResponseEntity<List<ProductsDto>>(products,HttpStatus.OK);
	}
}
