package com.vendor.VendorService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vendor.VendorService.pojo.Products;
import com.vendor.VendorService.pojo.Suppliers;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

	@Query("SELECT a FROM Products a WHERE a.supplierId = ?1")
	List<Products> getSuppliersProduct(Suppliers supplierId);
	
}
