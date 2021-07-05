package UCF.Assignments;

import javafx.beans.property.SimpleStringProperty;

public class ToDoTask {
    private final SimpleStringProperty toDoTitle = new SimpleStringProperty("");

    public ToDoTask(String toDoTitle) {
        setToDoTitle(toDoTitle);
    }

    public String getToDoTitle() {
        return toDoTitle.get();
    }

    public SimpleStringProperty toDoTitleProperty() {
        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {
        this.toDoTitle.set(toDoTitle);
    }
}
