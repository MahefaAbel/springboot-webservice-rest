

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Projects {
	@Id @GeneratedValue
	private final long id;
	private String title;
	private String description;
	private int company_id;
	private int user_id;
	
	public Projects(
			long id, 
			String title,
			String description,
			int company_id,
			int user_id
	) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.company_id = company_id;
		this.user_id = user_id;
	}
}
