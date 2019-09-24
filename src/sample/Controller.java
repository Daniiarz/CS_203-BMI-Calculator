package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private TextField weight_field;

    @FXML
    private TextField height_field;

    @FXML
    private Button calculate_bmi;

    @FXML
    private Label users_bmi;

    @FXML
    private ImageView bmi_image;

    @FXML
    void calculate_bmi(ActionEvent event){
        Double height = Double.parseDouble(height_field.getText());
        Double bmi = Integer.parseInt(height_field.getText())/ (height * height);
        users_bmi.setText(bmi.toString());
    }
}
