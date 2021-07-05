package ucf.assignments;

import org.junit.jupiter.api.Test;

class TodolistTableManagerTest {

    @Test
    void add() {
        // Given
        // create  an object TodoListTableManager
        // expectedData observable  collection object set to empty
        // create actualData Observable Collection

        // when...
        // call method ADD to add new TodoTask object

        // then
        //assertEquals(expectedData,actualData);

    }

    @Test
    void sort() {
        // Given
        // create an object TodoListTableManager
        // actualData Observable  Collection object set data
        // create actualData Observable Collection in lexicographic order

        // when...
        // call method sort to sort expectedData

        // then
        //assertEquals(expectedData,actualData);

    }

    @Test
    void save() {
        // Given
        // create an object TodoListTableManager
        // actualData Observable  Collection object set data
        // create actualData Observable Collection in lexicographic order

        // when...
        // call method sort to sort expectedData

        // then
        //assertEquals(expectedData,actualData);
    }

    @Test
    void setTableEditable() {
    }

    @Test
    void delete() {
        // Given
        // create  an object TodoListTableManager
        // expectedData observable  collection object
        // add test objects to expectedData
        // create actualData Observable Collection with the deleted object

        // when...
        // get the row to be deleted.
        // call method deleted  to delete TodoTask object

        // then
        //assertEquals(expectedData,actualData);


    }

    @Test
    void showIncompleteItems() {
        // Given
        // create  an object TodoListTableManager
        // expectedData observable  collection
        // add objects with complete  and incomplete item tags.
        // create actualData Observable Collection with only incomplete.

        // when...
        // call method showIncompleteItems to add new TodoTask object

        // then
        //assertEquals(expectedData,actualData);
    }

    @Test
    void showCompleteItems() {
        // Given
        // create  an object TodoListTableManager
        // expectedData observable  collection
        // add objects with complete  and incomplete item tags.
        // create actualData Observable Collection with only incomplete.

        // when...
        // call method showIncompleteItems to add new TodoTask object

        // then
        //assertEquals(expectedData,actualData);
    }
}