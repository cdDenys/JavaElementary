package service;

import dao.StatusDao;
import model.Status;

public class StatusService {

    public StatusDao statusDao = new StatusDao();

    public void save(Status status) {
        statusDao.save(status);
    }

    public void delete(Status status) {
        statusDao.delete(status);
    }

    public void update(Status status) {
        statusDao.update(status);
    }

    public Status findById(long id) {
        return statusDao.findById(id);
    }
}
