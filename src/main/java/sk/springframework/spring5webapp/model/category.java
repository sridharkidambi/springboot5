package sk.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class category {

@javax.persistence.Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String desc;

    @ManyToMany(mappedBy = "categories")
    private Set<Receipe> receipes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<Receipe> getReceipes() {
        return receipes;
    }

    public void setReceipes(Set<Receipe> receipes) {
        this.receipes = receipes;
    }



}
