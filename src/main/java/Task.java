public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        if (isDone) {
            return "[X]";
        }
        return "[ ]";
    }

    public void setDone(String mark) {
        if (mark.equals("mark")) {
            this.isDone = true;
        } else {
            this.isDone = false;
        }
    }

}