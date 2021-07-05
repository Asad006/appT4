package UCF.Assignments;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TodolistTableManager {

    public void add(String text, TableColumn<String, String> toDoListTable) {
        //toDoListTable.getColumns().add(text);
    }
    public void sort(TableView table, TableColumn column){
        table.getSortOrder().add(column);

    }

    public void save(ObservableList<ToDoTask> taskDataList) {

    }
}
