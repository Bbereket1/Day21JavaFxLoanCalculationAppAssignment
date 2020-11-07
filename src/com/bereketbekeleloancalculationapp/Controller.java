package com.bereketbekeleloancalculationapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class Controller {

    @FXML
    private CheckBox Calculate;
    @FXML
    private TextField dollarAmount;
    @FXML
    private TextField interestRate;
    @FXML
    private TextField numberOfYears;
    @FXML
    private Button submitButton;

        //double monthlyPayment = ((dollarAmount * interestRate)) / (1 - (Math.pow(1 / (1 + interestRate), (numberOfYears * 12))))));
           /* if (submitButton.isPressed()) {

                //System.out.println(monthlyPayment);
            } else {
                System.out.println("You are missing data required!");

            }*/



    public void money(KeyEvent keyEvent) {
    }

    public void onSubmit(ActionEvent actionEvent) {
        double a = Double.parseDouble(dollarAmount.getText());
        double b = Double.parseDouble(interestRate.getText());
        int c = Integer.parseInt(numberOfYears.getText());


        double monthlyAmount = (a * b / (1 - (Math.pow(1 / (1 + b), (c * 12)))));
        if (dollarAmount.getText().isEmpty() || dollarAmount.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error","Please enter the dollar amount!" );

        } else if (interestRate.getText().isEmpty() || interestRate.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error","Please enter the interest rate!" );

        } else if (numberOfYears.getText().isEmpty() || numberOfYears.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error","Please enter number years!");

        }
            System.out.println("Monthly payment: " + monthlyAmount);

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Your monthly payment due is " + "$" + monthlyAmount);
        alert.setHeaderText(null);
        alert.show();



      // Another way of Loan Calculator App
        // Using different formula
        // If the user inputs the number of years data in months grater than 12, like = 24Months
        // The result is different

           /*

            b /= 100.0;
            double monthlyRate = b / 12.0;
            int termInMonths = c * 12;

            double monthlyPayment = (a * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
           System.out.println("Monthly payment: " + monthlyPayment);

            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setTitle("Error");
            alert1.setContentText("Your monthly payment due is " + "$" + monthlyPayment);
            alert1.setHeaderText(null);
            alert1.show();

*/
    }


}
