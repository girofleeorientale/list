package sample;

public class Task {
    private int uid;
    private String text;
    private long dateTime;
    private boolean done;

    public int getId () {
        return this.uid;
    }

    public String getText () {
        return this.text;
    }

    public long getDateTime () {
        return this.dateTime;
    }

    public boolean getDone () {
        return this.done;
    }

    public void setId (int id) {
        this.uid = id;
    }

    public void setText (String text) {
        this.text = text;
    }

    public void setDateTime (long dateTime) {
        this.dateTime = dateTime;
    }

    public void setDone (boolean done) {
        this.done = done;
    }

    public static Task createTask(int uid, String text, long dateTime, boolean done) {
        Task task = new Task();
        task.uid = uid;
        task.text = text;
        task.dateTime = dateTime;
        task.done = done;

        return task;
    }

}
