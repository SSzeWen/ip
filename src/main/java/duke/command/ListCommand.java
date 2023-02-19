package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class ListCommand extends Command{

    @Override
    public void execute(TaskList tasks, Storage database) {
        Ui.printList(tasks);
    }
}