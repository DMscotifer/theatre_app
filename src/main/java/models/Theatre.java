package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="theatre")
public class Theatre {

    private int id;
    private String name;
    private Set<Play> shows;

    public Theatre(){}

    public Theatre(String name) {
        this.name = name;
        this.shows = new HashSet<Play>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="venue")
    public Set<Play> getShows() {
        return shows;
    }

    public void setShows(Set<Play> shows) {
        this.shows = shows;
    }

    public void addPlayToShows(Play play){
        this.shows.add(play);
    }
}
