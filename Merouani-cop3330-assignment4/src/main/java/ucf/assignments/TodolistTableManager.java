package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Asad merouani
 */
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TodolistTableManager {

    public void add(String text, TableColumn<String, String> toDoListTable) {
        // get the column of the tableView
        // add the new value to the column the tableview

    }
    public void sort(TableView table, TableColumn column){
        // call the built in sort method of the Observable Object.

    }

    public void save(ObservableList<ToDoTask> taskDataList) {
        // open json file
        // the data of the tableView
        // Do serialization of the object to json Object
        // write the data in the file
        // close the file

    }


    public void setTableEditable(TableColumn toDoColumn) {


        // call SetCellFactory method to make the cell as text field
        // call setOnEditCommit and assign click event to the column
        // set The object of the type ToDoTask with the new entered value
        // add the new value to the table view data
        // refresh the Tableview rendering
    }

    public void delete(TableView<ToDoTask> toDoTaskTableView) {
        // Get Observable Collection data of the list
        // get the selected cell from observable collection
        // create object of the todoTask
        // call remove function of the observable collection
    }

    public void showIncompleteItems(TableView<TaskItem> taskItemTableView) {
        // Get Observable Collection data of the list.
        // Create an object of the class ToDoTask.
        // Set the object status to complete.
        // Get the TableView of the item.
        // Get the status column.
        // Get all the elements of the Observable collection that has a incomplete status.
        // Assign the incomplete items to the New observable collection data.
        // Load the new observable collection data to the TableView To display.
    }

    public void showCompleteItems(TableView<TaskItem> taskItemTableView) {
        // Get Observable Collection data of the list.
        // Create an object of the class ToDoTask.
        // Set the object status to complete.
        // Get the TableView of the item.
        // Get the status column.
        // Get all the elements of the Observable collection that has a complete status.
        // Assign the completed items to the New observable collection data.
        // Load the new observable collection data to the TableView To display.
    }
}
