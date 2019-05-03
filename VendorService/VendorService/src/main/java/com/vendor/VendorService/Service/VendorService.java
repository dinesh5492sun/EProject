package com.vendor.VendorService.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.VendorService.Entity.ProductsDto;
import com.vendor.VendorService.Entity.SuppliersDto;
import com.vendor.VendorService.Repository.SuppliersRepository;
import com.vendor.VendorService.mapper.ProductMapper;
import com.vendor.VendorService.mapper.SuppliersMapper;
import com.vendor.VendorService.pojo.Products;
import com.vendor.VendorService.pojo.Suppliers;

@Service
public class VendorService implements IVendorService {

	@Autowired
	private SuppliersRepository suppliersRepository;

	@Override
	public List<SuppliersDto> getSuppliers() {
		List<Suppliers> suppliers = suppliersRepository.findAll();
		/*return suppliers.stream()
				.map(SuppliersMapper::convertToSupplierDto)
				.collect(Collectors.toList());*/
		
		return suppliers.stream().map(suppl -> {
			return SuppliersMapper.convertToSupplierDto(suppl);
		}).collect(Collectors.toList());
	}

	@Override
	public List<ProductsDto> getSupplierProducts(int supplierId) {
		Suppliers supplier=suppliersRepository.getSuppliers(supplierId);
		List<Products> products=supplier.getProducts();
		
		return products.stream().map(prod ->{
			return ProductMapper.convertToProductDto(prod);
		}).collect(Collectors.toList());
		
	}

}
