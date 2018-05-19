package models;

import java.util.Set;

public class Theatre {

    private int id;
    private String name;
    private Set<Play> shows;

    public Theatre(){}

    public Theatre(String name, Set<Play> shows) {
        this.name = name;
        this.shows = shows;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Play> getShows() {
        return shows;
    }

    public void setShows(Set<Play> shows) {
        this.shows = shows;
    }
}
