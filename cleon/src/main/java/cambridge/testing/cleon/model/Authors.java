package cambridge.testing.cleon.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Authors {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lastName;
	private String firstName;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Books> Books;
	
	public Authors(String lastName, String firstName, Set<cambridge.testing.cleon.model.Books> books) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		Books = books;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Set<Books> getBooks() {
		return Books;
	}

	public void setBooks(Set<Books> books) {
		Books = books;
	}
}
