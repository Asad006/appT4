package UCF.Assignments;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.TextField;

public class ToDoListController {
    TodolistTableManager todolistTableManager = new TodolistTableManager();
    @FXML
    private  TableView<ToDoTask> TasksTableView ;

    @FXML
    private TableColumn ToDoListTable ;

    @FXML
    private TableView<String> ItemsTableView;

    @FXML
    private TableColumn<String, String> Items;

    @FXML
    private TextField AddToDoListText;

    @FXML
    private Button AddTaskButton;



    @FXML
    void AddTaskButtonClicked(ActionEvent event) {
        // get the the textField content
        // call TodolistManager to set the the new content into the todolist.
        // clear the textField
         final ObservableList<ToDoTask> data = TasksTableView.getItems();


        String text = AddToDoListText.getText();
        //todolistTableManager.add(text,ToDoListTable);
        //ToDoListTable.setCellValueFactory(new PropertyValueFactory<>("Tasks"));
        //TasksTableView.getColumns().add(ToDoListTable);


        data.add(new ToDoTask("Hello"));
        AddToDoListText.clear();
    }



}
