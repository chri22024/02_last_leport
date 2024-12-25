public class Task {

    private int id;
    private String name;
    private boolean status;

    public Task(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setComplete(boolean status) {
        this.status = status;
    }

    public String show() {
        return id + " " + name + " " + status;
    }


}
