package com.vendor.VendorService.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vendor.VendorService.OneToOne.UserDetails;

@Repository
public interface UserDetailsRepository  extends JpaRepository<UserDetails, Integer>{
	
	@Query("SELECT a FROM UserDetails a WHERE a.userId = ?1")
	UserDetails findById(int userId);
}
