package models;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="author")
public class Author {

    private int id;
    private String name;
    private double salary;
    private Set<Play> plays;

    public Author(){}

    public Author(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.plays = plays;
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

    @Column(name="salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @OneToMany(mappedBy = "author")
    public Set<Play> getPlays() {
        return plays;
    }

    public void setPlays(Set<Play> plays) {
        this.plays = plays;
    }
}
