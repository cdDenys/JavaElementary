package service;

import dao.StatusDao;
import model.Status;
import org.apache.log4j.Logger;

public class StatusService {
    Logger logger = Logger.getLogger(StatusService.class);

    public StatusDao statusDao = new StatusDao();

    public void save(Status status) {
        logger.debug(status.toString());
        statusDao.save(status);
    }

    public void delete(Status status) {
        logger.debug(status.toString());
        statusDao.delete(status);
    }

    public void update(Status status) {
        logger.debug(status.toString());
        statusDao.update(status);
    }

    public Status findById(long id) {
        logger.debug(String.format("status.findByID {id = %d}", id));
        return statusDao.findById(id);
    }
}
