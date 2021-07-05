package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Asad merouani
 */
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {
    TodolistTableManager todolistTableManager = new TodolistTableManager();
    ObservableList<TaskItem> todoItemsData;
    ObservableList<ToDoTask> taskDataList;
    ObservableList<TaskItem> todoItemsDataIncomplete;
    ObservableList<TaskItem> todoItemsDataComplete;
    @FXML
    private TableView<ToDoTask> toDoTaskTableView;

    @FXML
    private TableView<TaskItem> taskItemTableView;

    @FXML
    private TableColumn toDoColumn;

    @FXML
    private TableColumn Items;

    @FXML
    private TableColumn descriptionColumn;

    @FXML
    private TableColumn dueDateColumn;

    @FXML
    private TextField addToDoListText;

    @FXML
    private Button AddTaskButton;

    @FXML
    private TextField itemName;

    @FXML
    private TextField description;

    @FXML
    private Button addItem;

    @FXML
    private TextField dueDate;

    @FXML
    void AddTaskButtonClicked(ActionEvent event) {
        // get the the textField content
        // call add method of TodolistManager to set the the new content into the todolist.
        // clear the textField
        //final ObservableList<ToDoTask> data = TasksTableView.getItems();

    }

    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        // get the the textField content
        // call TodolistManager to set the the new content into the todolist.
        // clear the textField

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // populates the tableView// ToDat
        // toDoTaskTableView.getItems();
        // Set the cells todoTasks  table to be editable
        // Call setEditable function to make the title changeable.
        // call setEditable function to make description and and due date editable

    }

    public void saveTaskClicked(ActionEvent actionEvent) {
        // Get the Observable data collection of the task list
        //call the save function in the ToDoListManager

    }

    public void deleteTaskClicked(ActionEvent actionEvent) {
        //call the method delete of the todolistTaskManager

    }

    public void saveItemClicked(ActionEvent actionEvent) {
        //get The variable of the Observable Collection data of the list
        // get the selected cell from observable collection
        // create object of the todoTask
        // call remove function of the observable collection
    }

    public void deleteItemClicked(ActionEvent actionEvent) {
        //call the method delete of the todolistTaskManager

    }

    public void showIncompleteClicked(ActionEvent actionEvent) {
        // call show showIncompleteItems method of the todolistTableManager.

    }

    public void showCompleteClicked(ActionEvent actionEvent) {
        // call show showCompleteItems method of the todolistTableManager.
    }


}
