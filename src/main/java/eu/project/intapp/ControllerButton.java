package eu.project.intapp;

import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;

public class ControllerButton {

    private Circle myCircle;
    private Double x;
    private Double y;

    public void buttonOne(ActionEvent e) {
        System.out.println("button 1");
    }

    public void buttonTwo(ActionEvent e) {
        System.out.println("button 2");
    }

}
