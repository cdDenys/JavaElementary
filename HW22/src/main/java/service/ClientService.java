package service;

import dao.ClientDao;
import model.Client;

public class ClientService {

    ClientDao clientDao = new ClientDao();
    public void save(Client client) {
        clientDao.save(client);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }

    public Client findById(long id) {
        return clientDao.findById(id);
    }

    public Client findByPhone(long phone) {
        return clientDao.findByPhone(phone);
    }
}