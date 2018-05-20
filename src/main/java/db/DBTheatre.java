package db;

import models.Play;
import models.Theatre;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBTheatre {

    private static Session session;
    private static Transaction transaction;

    public static List<Play> getShowsFromTheatre(Theatre theatre){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Play> results = null;

        try {
            Criteria cr = session.createCriteria(Play.class);
            cr.createAlias("theatre", "individual_theatre");
            cr.add(Restrictions.eq("individual_theatre.id", theatre.getId()));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static void addPlayToShows(Theatre theatre, Play play){
        theatre.addPlayToShows(play);
        play.setVenue(theatre);
        DBHelper.save(theatre);
        DBHelper.save(play);
    }


}
