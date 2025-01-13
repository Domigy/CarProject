package org.example.carproject;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private TableColumn<Car, Integer> tableyear;
    @FXML
    private TextField licensePlateNumber;
    @FXML
    private Spinner<Integer> year;
    @FXML
    private TableColumn<Car, String> tablelicensePlateNumbe;
    @FXML
    private TableColumn<Car,String> tablename;

    private List<Car> carList;
    @FXML
    private TextField name;
    @FXML
    private TableView table;

    @FXML
    public void addButton(ActionEvent actionEvent) {
        if (Hibak()) {
            // Ha hiba történt, ne adjuk hozzá az új autót
            return;  // Kilépünk a metódusból, nem folytatjuk a műveletet
        }
        Car newCar = new Car(licensePlateNumber.getText(), name.getText(), year.getValue());
        carList.add(newCar);
        table.setItems(FXCollections.observableArrayList(carList));
        licensePlateNumber.setText("");
        name.setText("");
    }
    public boolean Hibak(){
        Alert alert= new Alert(Alert.AlertType.ERROR);
        boolean hasError = false;
        if(licensePlateNumber.getText().isEmpty()){

            alert.setTitle("Nem adott meg licensePlateNumber-t!");
            alert.setContentText("Nem adott meg licensePlateNumber-t!");
            hasError = true;
            alert.showAndWait();


        }
        if(name.getText().isEmpty()){

            alert.setTitle("Nem adott meg name-t!");
            alert.setContentText("Nem adott name-t!");
            hasError = true;
            alert.showAndWait();

        }
        try
        {
            Double.parseDouble(year.getValue().toString());
            Double.parseDouble(year.getValue().toString());

        }
        catch (NullPointerException | NumberFormatException ex)
        {
            alert.setContentText("Nem számot adott meg!");
            hasError = true;
            alert.showAndWait();
        }
        return hasError;
    }

    public void initialize(){
        int currentYear = LocalDate.now().getYear();
        carList= new ArrayList<>();
        year.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1950, currentYear, 1));
        tablelicensePlateNumbe.setCellValueFactory(new PropertyValueFactory<>("licensePlateNumber"));
        tablename.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableyear.setCellValueFactory(new PropertyValueFactory<>("year"));

        table.setItems(FXCollections.observableArrayList(carList));

    }
}