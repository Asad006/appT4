package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToDoListController {
    @FXML
    private  ListView<String> toDoListView =  new ListView<String>();

    @FXML
    private TextField AddListTextField;



    @FXML
    void AddListClicked(ActionEvent event) {
        String text = AddListTextField.getText();
            listViewManager(text);
            AddListTextField.clear();
    }


    private void listViewManager(String text){
        ObservableList<String> items = FXCollections.observableArrayList ();
        items.add(text);
        System.out.println(items);
        if(!text.equals("")){
        toDoListView.getItems().add(toDoListView.getItems().size(), text);
        toDoListView.scrollTo(toDoListView.getItems().size() - 1);
        }
    }
}
