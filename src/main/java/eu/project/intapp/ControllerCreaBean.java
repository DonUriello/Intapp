package eu.project.intapp;

import eu.project.intapp.util.Util;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class ControllerCreaBean {

    @FXML
    private TextArea textAreaIn;

    @FXML
    private TextArea textAreaOut;

    public void createBean() {
        System.out.println("LOG : " + Util.split(textAreaIn.getText()));
    }
    public void cleanAllScene() {
        this.textAreaIn.setText("");
        this.textAreaOut.setText("");
        System.out.println("LOG : Clean.");
    }
}
