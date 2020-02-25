package cambridge.testing.cleon.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String isbn;
	
	@ManyToMany
	@JoinTable(name = "author_book")
	private Set<Authors> authors;
	
	public Books(String title, String isbn, Set<Authors> authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Authors> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Authors> authors) {
		this.authors = authors;
	}
}
