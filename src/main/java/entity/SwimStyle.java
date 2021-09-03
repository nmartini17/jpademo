package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SwimStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String styleName;

    @ManyToMany
    private List<Person> persons;

    public SwimStyle() {
    }

    public SwimStyle(String styleName) {
        this.styleName = styleName;
        this.persons = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
