import db.DBHelper;
import db.DBTheatre;
import models.Actor;
import models.Author;
import models.Play;
import models.Theatre;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("The Pavilion");
        DBHelper.save(theatre);

        Actor actor1 = new Actor("Sean Bean");
        DBHelper.save(actor1);

        Author author1 = new Author("William Shakespeare", 20000.00);
        DBHelper.save(author1);

        Play play1 = new Play("Macbeth", author1, 120, theatre);
        DBHelper.save(play1);

        Play play2 = new Play("The Tempest", author1, 100, theatre);
        DBHelper.save(play2);

        DBTheatre.addPlayToShows(theatre, play1);

        List<Play> showsAtPavilion = DBTheatre.getShowsFromTheatre(theatre);

        List<Play> allShows = DBHelper.getAll(Play.class);


    }

}
