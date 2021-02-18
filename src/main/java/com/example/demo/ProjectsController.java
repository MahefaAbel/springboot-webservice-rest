package com.example.demo;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projects")
public class ProjectsController {
	
	@GetMapping("/all")
	public ArrayList<Projects> getAllProjects(){
		ArrayList<Projects> listProjects = new ArrayList<Projects>();
		listProjects.add(new Projects(1, "Jaune", "Bidon Jaune", 2, 3));
		listProjects.add(new Projects(2, "Rouge", "Bidon Rouge", 2, 3));
		listProjects.add(new Projects(3, "Vert", "Bidon Vert", 2, 3));
		return listProjects;
	}
	
	@GetMapping("/{id}")
	public Projects getProject(
		@RequestParam(value="id", defaultValue="4") int id
	) {
		Projects project = new Projects(1, "Jaune", "Bidon Jaune", 2, 3);
		return project;
	}	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String createProject(
//			@RequestBody Projects requestProjects
	) {
		String result = "";
		result = "Ajout effectuer";
		return result;
	}
	
	
}
