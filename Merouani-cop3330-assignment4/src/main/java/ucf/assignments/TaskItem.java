package UCF.Assignments;

import javafx.beans.property.SimpleStringProperty;

public class TaskItem {

    private final SimpleStringProperty itemName = new SimpleStringProperty("");
    private final SimpleStringProperty description = new SimpleStringProperty("");
    private final SimpleStringProperty dueDate = new SimpleStringProperty("");
    private final SimpleStringProperty status = new SimpleStringProperty("Incomplete");

    public TaskItem( String itemName, String description, String dueDate,String status) {
        setDescription(description);
        setDueDate(dueDate);
        setItemName(itemName);
        setStatus(status);
    }
    public TaskItem( String itemName, String description, String dueDate) {
        setDescription(description);
        setDueDate(dueDate);
        setItemName(itemName);

    }

    public String getItemName() {
        return itemName.get();
    }

    public SimpleStringProperty itemNameProperty() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getDueDate() {
        return dueDate.get();
    }

    public SimpleStringProperty dueDateProperty() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate.set(dueDate);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}
