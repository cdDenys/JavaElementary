import model.Player;
import model.Device;
import model.Game;
import model.Rank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Device device = new Device();
        Rank rank = new Rank();
        Game game = new Game();
        player.setName("Player");
        player.setPhone(3809999999L);
        device.setDeviceName("Iphone 11");
        device.setIMEI("UA1223344");
        device.setPlayer(player);
        player.setDevice(device);
        rank.setRank("PRO");
        game.setDevice(device);
        game.setPlayer(player);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(player);
        session.save(rank);
        session.save(device);
        session.save(game);
        transaction.commit();
        session.close();

    }
}
