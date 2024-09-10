package eu.project.intapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class ControllerCircle {

    @FXML
    private Circle myCircle;
    private Double x = (double) 0;
    private Double y = (double) 0;

    private Double step = (double) 3;
    public void up(ActionEvent e) {
        myCircle.setCenterY(y-=step);
    }
    public void right(ActionEvent e) {
        myCircle.setCenterX(x+=step);
    }
    public void down(ActionEvent e) {
        myCircle.setCenterY(y+=step);
    }
    public void left(ActionEvent e) {
        myCircle.setCenterX(x-=step);
    }

}
