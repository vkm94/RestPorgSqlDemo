package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LoadModel;

@RestController
public class LoadOperations {
	@Autowired
	public LoadController lc;
		@PostMapping("/load")
		public String AddLoadItems(@RequestBody LoadModel lm) {
			return  lc.addItems(lm);
			
			
		}

	
	  @PutMapping("/load/{id}") public String EditDetails(@PathVariable Integer id,@RequestBody LoadModel lm) {
	  
	  return lc.UpdateDetails(id,lm);
	  
	  }
	 
	@DeleteMapping("/deleteload/{id}")
		public String DeleteDetalis(@PathVariable Integer id) {
		
			return lc.DeleteLoad(id);
			
		}
	@GetMapping("/load")
	public List<LoadModel> load(){
		return lc.getList();
		
	}
	@GetMapping("/load/{id}")
public Optional<LoadModel> loadById(@PathVariable Integer id){
		return lc.loadById(id);
		
		}

}
