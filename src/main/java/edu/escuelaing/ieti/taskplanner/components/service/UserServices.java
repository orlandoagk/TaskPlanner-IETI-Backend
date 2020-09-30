package edu.escuelaing.ieti.taskplanner.components.service;


import edu.escuelaing.ieti.taskplanner.components.model.User;
import edu.escuelaing.ieti.taskplanner.components.persistence.TaskPlannerException;


import java.util.List;

public interface UserServices {
    List<User> getAll();

    User getByUsername(String username) throws TaskPlannerException;

    User create(User user) throws TaskPlannerException;

    User update(User user);

    void remove(String username);
}

