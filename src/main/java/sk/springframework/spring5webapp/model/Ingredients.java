package sk.springframework.spring5webapp.model;

import javax.persistence.*;

@Entity
public class Ingredients {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne(fetch = FetchType.EAGER)
    private unitMeasure unitMeasureItem;

    @ManyToOne
    private Receipe receipe;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }

    public String getIngredentsName() {
        return ingredentsName;
    }

    public void setIngredentsName(String ingredentsName) {
        this.ingredentsName = ingredentsName;
    }

    private String ingredentsName;


}
