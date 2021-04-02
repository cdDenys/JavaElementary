package util;

import dao.ClientDao;
import model.Account;
import model.Client;
import model.Status;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        Logger logger = Logger.getLogger(HibernateUtil.class);
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Account.class);
                configuration.addAnnotatedClass(Status.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
                logger.error("Configuration error: " + configuration);
            } catch (Exception e) {
//                System.out.println("Session factory Error: " + e);
                logger.error("Session error: " + e);
            }
        }
        return sessionFactory;
    }
}
