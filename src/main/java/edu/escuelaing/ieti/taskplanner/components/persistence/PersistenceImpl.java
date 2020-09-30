package edu.escuelaing.ieti.taskplanner.components.persistence;

import edu.escuelaing.ieti.taskplanner.components.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersistenceImpl implements PersistenceInterface {

    @Override
    public User addUser(User user) throws TaskPlannerException {
        for(User u:users){
            if(u.getUsername().equals(user.getUsername())){
                throw new TaskPlannerException(TaskPlannerException.YA_EXISTE_USUARIO);
            }
        }
        users.add(user);
        return user;
    }

    @Override
    public void deleteUser(String username) {
        for(int i = 0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                users.remove(i);
                break;
            }
        }

    }

    @Override
    public User updateUser(User user) {
        for(int i = 0;i<users.size();i++){
            if(users.get(i).getUsername().equals(user.getUsername())){
                users.remove(i);
                users.add(user);
                break;
            }
        }
        return user;
    }

    @Override
    public User getUserByUsername(String username) throws TaskPlannerException {
        User user = null;
        for(int i = 0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username)){
                user = users.get(i);
                break;
            }
        }
        if(user==null){
            throw new TaskPlannerException(TaskPlannerException.NO_EXISTE_USUARIO);
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
