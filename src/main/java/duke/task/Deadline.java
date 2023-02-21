package duke.task;

/**
 * Deadline class that keeps track of a task description and a task deadline
 */
public class Deadline extends Task {
    /**
     * the deadline where the description of the task should be completed by
     */
    protected String deadline;

    /**
     * The Constructor of the Deadline Object which initialises the description, deadline and the taskString
     *
     * @param description describes what the task is about
     * @param deadline    the timing the task should be completed by
     */
    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = deadline;
        this.taskString = saveTaskString();
    }

    /**
     * Returns the specific Object task in readable format to the user which contains information such as
     * the description, whether its marked or not and the deadline
     *
     * @return
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + deadline + ")";
    }

    /**
     * Returns the string in the format that it is to be saved in the database
     *
     * @return the String in the right format of deadline type of task
     */
    @Override
    public String saveTaskString() {
        String saveString = new String();
        saveString += "D" + COMMA_TASK_SEPARATOR + isDone + COMMA_TASK_SEPARATOR + description + COMMA_TASK_SEPARATOR
                + deadline;
        return saveString;
    }
}
