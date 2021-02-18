

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projects")
public class ProjectsController {
	
	@GetMapping("/getAllProjects")
	public ArrayList<Projects> getAllProjects(){
		ArrayList<Projects> listProjects = new ArrayList<Projects>();
		listProjects.add(new Projects(1, "Jaune", "Bidon Jaune", 2, 3));
		return listProjects;
	}
}
