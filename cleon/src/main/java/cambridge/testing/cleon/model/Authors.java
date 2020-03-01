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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authors other = (Authors) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Authors [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", Books=" + Books + "]";
	}
	
	
}
