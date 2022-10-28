package hu.petrik.embereklista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class EmberekController {
    @FXML
    private ListView<Ember> emberek;

    @FXML
    private void initialize() {
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszt Elek", 42);
        Ember e3 = new Ember("Lakatos István Károly", 17);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }
}