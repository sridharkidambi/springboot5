package sk.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<author> _authors=new HashSet<author>();

    public books(String firstName, String lastName, Set<author> _authors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this._authors = _authors;
    }

    public books(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public books(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<author> get_authors() {
        return _authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        books books = (books) o;
        return id == books.id;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", _authors=" + _authors +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void set_authors(Set<author> _authors) {
        this._authors = _authors;
    }
}
