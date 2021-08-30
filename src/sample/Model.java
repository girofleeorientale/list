package sample;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List <Task> tasksList = new ArrayList();
    Task currentTask;

    public Model () {
    }

    public void createList () {
        if (this.isEmpty()) {
            tasksList.add(currentTask);
        }
    }

    public boolean isEmpty() {
        return false;
    }
}
