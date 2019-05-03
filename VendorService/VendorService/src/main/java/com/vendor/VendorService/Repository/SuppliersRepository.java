package com.vendor.VendorService.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vendor.VendorService.pojo.Suppliers;

@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers, Long> {
	
	@Query("SELECT a FROM Suppliers a WHERE a.supplierId = ?1")
	Suppliers getSuppliers(int supplierId);
}
