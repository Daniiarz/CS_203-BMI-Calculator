package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.math.BigDecimal;

public class Controller {

    @FXML
    private TextField weight_field;

    @FXML
    private TextField height_field;

    @FXML
    private Button CalculateBMI;

    @FXML
    private Label users_bmi;

    @FXML
    private ImageView bmi_image;

    @FXML
    void ClculateBMI(ActionEvent event) {
        try{
            double height = Double.parseDouble(height_field.getText());
            double weight = Double.parseDouble(weight_field.getText());

            if  (height == 0 || weight == 0){
                throw new Exception("Enter a valid number");
            }

            double bmi = weight / (height * height);

            users_bmi.setText(Double.toString(bmi));


            if (18.5 > bmi){
                bmi_image.setImage(new Image("sample/static/underweight.jpeg"));
            }
            else if (18.5 < bmi && bmi < 24.9){
                bmi_image.setImage(new Image("sample/static/normal.jpeg"));
            }
            else if (25.0 < bmi && bmi < 29.9){
                bmi_image.setImage(new Image("sample/static/overweight.jpeg"));
            }
            else if (30 < bmi ){
                bmi_image.setImage(new Image("sample/static/obese.jpeg"));
            }
        }
        catch(Exception e){
            height_field.setText("");
            weight_field.setText("Please enter a valid number");
            System.out.println(e);
            bmi_image.setImage(new Image("sample/static/proxy.duckduckgo.com"));
        }
    }
}
