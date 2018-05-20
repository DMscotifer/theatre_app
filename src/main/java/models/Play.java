package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="plays")
public class Play {

    private int id;
    private String title;
    private Author author;
    private double duration;
    private Theatre venue;

    public Play(String title, Author author, double duration, Theatre venue) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.venue = venue;
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

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "author", nullable = false)
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Column(name="duration")
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @ManyToOne
    @JoinColumn(name = "theatre", nullable = false)
    public Theatre getVenue() {
        return venue;
    }

    public void setVenue(Theatre venue) {
        this.venue = venue;
    }

}
