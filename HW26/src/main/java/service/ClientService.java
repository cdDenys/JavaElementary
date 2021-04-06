package service;

import dao.ClientDao;
import model.Client;
import org.apache.log4j.Logger;

public class ClientService {
    Logger logger = Logger.getLogger(ClientService.class);

    ClientDao clientDao = new ClientDao();
    public void save(Client client) {
        logger.debug(client.toString());
        clientDao.save(client);
    }

    public void update(Client client) {
        logger.debug(client.toString());
        clientDao.update(client);
    }

    public void delete(Client client) {
        logger.debug(client.toString());
        clientDao.delete(client);
    }

    public Client findById(long id) {
        logger.debug(String.format("client.findById {id = %d}", id));
        return clientDao.findById(id);
    }

    public Client findByPhone(long phone) {
        logger.debug(String.format("client.findByPhone {phone = %d}", phone));
        return clientDao.findByPhone(phone);
    }
}