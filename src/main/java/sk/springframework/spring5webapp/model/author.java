package sk.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    public author(String firstName, String lastName, Set<books> _book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this._book = _book;
    }

    private String lastName;

    public Set<books> get_book() {
        return _book;
    }

    public void set_book(Set<books> _book) {
        this._book = _book;
    }

    @Override
    public String toString() {
        return "author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", _book=" + _book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        author author = (author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToMany(mappedBy = "_authors")
    private Set<books> _book=new HashSet<books>();

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

    public author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
