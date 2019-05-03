package com.vendor.VendorService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vendor.VendorService.OneToOne.UserDetails;
import com.vendor.VendorService.OneToOne.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
	
	/*@Query("SELECT a FROM Vehicle a WHERE a.vechicleId = ?1")
	Vehicle findById(int vechicleId);
	
	@Query("SELECT a FROM Vehicle a WHERE a.userDetails = ?1")
	List<Vehicle> getUserIdDetails(UserDetails vehicle);*/
}
