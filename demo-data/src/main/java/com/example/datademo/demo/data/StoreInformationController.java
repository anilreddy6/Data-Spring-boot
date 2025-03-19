package com.example.datademo.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/stores")
public class StoreInformationController {
	
	@Autowired
	private StoreInformationRepo StoreInformationRepo;
	
	@GetMapping
    public List<StoreInformation> getAllStores() {
        return StoreInformationRepo.findAll();
    }

	@GetMapping("/{id}")
	public ResponseEntity<StoreInformation> getStoreById1(@PathVariable Integer id){
		
		Optional<StoreInformation> store = StoreInformationRepo.findById(id);
        return store.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
		
	}
	

    @PostMapping
    public StoreInformation createStore(@RequestBody StoreInformation storeInformation) {
        return StoreInformationRepo.save(storeInformation);
    }
	


	

}
