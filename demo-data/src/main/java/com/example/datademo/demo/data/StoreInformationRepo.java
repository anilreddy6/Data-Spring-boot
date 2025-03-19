package com.example.datademo.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface StoreInformationRepo extends JpaRepository<StoreInformation, Integer> {

	
	List<StoreInformation> findByStoreName(String name);
	List<StoreInformation> findByStorePhoneNumber(String number);
	
	
	@Query("FROM StoreInformation where storeId>=?1 and storeId<=?2")
	List<StoreInformation> findStoreInformationByIdRange(int Min,int Max);

	

	
}
