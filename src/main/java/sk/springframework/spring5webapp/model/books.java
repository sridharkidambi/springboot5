package sk.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<author> _authors;

    public books(String firstName, String lastName, List<author> _authors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this._authors = _authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<author> get_authors() {
        return _authors;
    }

    public void set_authors(List<author> _authors) {
        this._authors = _authors;
    }
}
