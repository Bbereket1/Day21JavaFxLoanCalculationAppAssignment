package com.bereketbekeleloancalculationapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

/*
    Create an app that calculates monthly loan payments. Create a UI that gets the following input from a user:

    principal dollar amount
    interest rate
    number of years
    Your app should have a submit button. In Controller.java, have an onSubmit method which,
    when the button is clicked, calculates the monthly payment amount based on this input and
    displays the data with an Alert.



    This is the equation for calculating monthly payments:

    monthlyAmount = principalAmount * interest / (1 - (Math.pow(1/(1 + interest), (numberOfYear*12)));



    Use an alert to display the monthly payment amount.
*/
