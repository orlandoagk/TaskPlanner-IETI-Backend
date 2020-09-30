package edu.escuelaing.ieti.taskplanner.components.persistence;

import javafx.concurrent.Task;

public class TaskPlannerException extends Exception {
    final static public String YA_EXISTE_USUARIO="Ya existe un usuario con el respectivo username";
    final static public String NO_EXISTE_USUARIO="No existe un usuario con el respectivo username";

    public TaskPlannerException(String message){
        super(message);
    }
}
