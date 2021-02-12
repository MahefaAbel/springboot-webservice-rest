package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/experience")
public class ExperienceController {
	

	@GetMapping("/")
	public String index() {
		return "ExperienceController::Index";
	}
	
	@GetMapping("/{id}")
	public Experience getExperience(
		@RequestParam(value="id", defaultValue="4") int id
	) {
		Experience experience = new Experience(1, "Lorem lupsom");
		return experience;
	}	
	
	@GetMapping("/all")
	public ArrayList<Experience> getAllExperience(	) {
		ArrayList<Experience> listExperience = new ArrayList<Experience>();
		listExperience.add(new Experience(1, "Lorem lupsom"));
		listExperience.add(new Experience(1, "Lorem lupsom 2"));
		listExperience.add(new Experience(1, "Lorem lupsom 3"));
		listExperience.add(new Experience(1, "Lorem lupsom 4"));
		return listExperience;
	}
	
	@PostMapping("/")
	public String ajoutExperience() {
		String result = "Ajout reussie";
		return result;
	}

}
