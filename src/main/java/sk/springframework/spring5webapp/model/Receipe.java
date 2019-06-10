package sk.springframework.spring5webapp.model;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Receipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String receipeName;

    @OneToMany(cascade = CascadeType.ALL ,  mappedBy="receipe")
    private List<Ingredients> ingredients;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getReceipeName() {
        return receipeName;
    }

    public void setReceipeName(String receipeName) {
        this.receipeName = receipeName;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
