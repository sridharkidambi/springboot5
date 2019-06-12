package sk.springframework.spring5webapp.model;


import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Receipe extends baseentity {


    @Column(name = "receipe_names")
    private String receipeName;

    @ManyToMany
    @JoinTable(name="receipe_catogory",
            joinColumns= @JoinColumn( name="receipe_id"),
            inverseJoinColumns = @JoinColumn(name="catogory_id") )
    private Set<category> categories;

    @OneToMany(cascade = CascadeType.ALL ,  mappedBy="receipe")
    private List<Ingredients> ingredients;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @Enumerated(value = EnumType.STRING)
    private difficulty difficultyLevel;

    public difficulty getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(difficulty difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
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

    public Set<category> getCategories() {
        return categories;
    }

    public void setCategories(Set<category> categories) {
        this.categories = categories;
    }
}
