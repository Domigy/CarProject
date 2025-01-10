package org.example.carproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private TableColumn tableyear;
    @FXML
    private TextField licensePlateNumber;
    @FXML
    private Spinner year;
    @FXML
    private TableColumn tablelicensePlateNumbe;
    @FXML
    private TableColumn tablename;

    private List<Car> carList;
    @FXML
    private TextField name;

    @FXML
    public void addButton(ActionEvent actionEvent) {
        Alert alert= new Alert(Alert.AlertType.ERROR);
    if(licensePlateNumber.getText().isEmpty()){

        alert.setTitle("Nem adott meg licensePlateNumber-t!");
        alert.setContentText("Nem adott meg licensePlateNumber-t!");
        alert.show();
    }
        if(name.getText().isEmpty()){

            alert.setTitle("Nem adott meg name-t!");
            alert.setContentText("Nem adott name-t!");
            alert.show();
        }
        if(year.getPromptText().isEmpty()){

            alert.setTitle("Nem adott meg year-t!");
            alert.setContentText("Nem adott meg year-t!");
            alert.show();
        }

    }

    public void initialize(){
        carList= new ArrayList<>();
    }
}