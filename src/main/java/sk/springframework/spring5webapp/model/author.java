package sk.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    public author(String firstName, String lastName, List<books> _book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this._book = _book;
    }

    private String lastName;

    public List<books> get_book() {
        return _book;
    }

    public void set_book(List<books> _book) {
        this._book = _book;
    }

    @ManyToMany(mappedBy = "_authors")
    private List<books> _book;
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

    public author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
