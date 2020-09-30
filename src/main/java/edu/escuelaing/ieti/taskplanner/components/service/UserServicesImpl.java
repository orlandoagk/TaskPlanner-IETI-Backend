package edu.escuelaing.ieti.taskplanner.components.service;

import edu.escuelaing.ieti.taskplanner.components.model.User;
import edu.escuelaing.ieti.taskplanner.components.persistence.PersistenceInterface;
import edu.escuelaing.ieti.taskplanner.components.persistence.TaskPlannerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private PersistenceInterface persistenceInterface;

    @Override
    public List<User> getAll() {
        return persistenceInterface.getAllUsers();
    }

    @Override
    public User getByUsername(String username) throws TaskPlannerException {
        return persistenceInterface.getUserByUsername(username);
    }

    @Override
    public User create(User user) throws TaskPlannerException {
        return persistenceInterface.addUser(user);
    }

    @Override
    public User update(User user) {
        return persistenceInterface.updateUser(user);
    }

    @Override
    public void remove(String username) {
        persistenceInterface.deleteUser(username);
    }
}
