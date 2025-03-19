package com.example.datademo.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDataApplication {

//	
//	@Autowired
//	StoreInformationRepo StoreInformationRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDataApplication.class, args);
	}
	
	
//   @Override
//	public void run(String...args) {
//	   
//	   StoreInformation StoreInformation1= new StoreInformation("Amazon","All products","12344");
//	   StoreInformation StoreInformation2= new StoreInformation("bestbuy","All electonics","1233874");
//	   StoreInformation StoreInformation3= new StoreInformation("Walmart","Groceries","12234344");
//	   StoreInformation StoreInformation4= new StoreInformation("Costco","wholesale","135344");
//	 
//	   StoreInformationRepo.save(StoreInformation1);
//	   StoreInformationRepo.save(StoreInformation2);
//	   StoreInformationRepo.save(StoreInformation3);
//	   StoreInformationRepo.save(StoreInformation4);
//	   
//	   StoreInformationRepo.findByStoreName("Amazon").forEach(
//			   val -> System.out.println(val)   
//			   );
//	   StoreInformationRepo.findByStorePhoneNumber("135344").forEach(
//			   val -> System.out.println(val)   
//			   );
//	   
//	   StoreInformationRepo.findStoreInformationByIdRange(1, 3).forEach(val-> System.out.println(val));
//	  
	
}
