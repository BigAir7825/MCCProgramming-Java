package com.mycompany.adairassignment5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        
        Scene scene = new Scene(grid, 300, 250);
        
        Label miles = new Label("Miles:");
        grid.add(miles, 0, 0);
        Label gallons = new Label("Gallons:");
        grid.add(gallons, 0, 1);
        Label milesPerGallon = new Label("MPG:");
        grid.add(milesPerGallon, 0, 2);
        
        TextField milesInput = new TextField();
        grid.add(milesInput, 1, 0);
        TextField gallonsInput = new TextField();
        grid.add(gallonsInput, 1, 1);
        TextField milesPerGallonOutput = new TextField();
        milesPerGallonOutput.setEditable(false);
        grid.add(milesPerGallonOutput, 1, 2);
        
        
        primaryStage.setTitle("Miles Per Gallon Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Button btn = new Button();
        btn.setText("Calculate");
        grid.add(btn, 1, 3, 2, 1);
        btn.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event) {
                double milesVar = Double.parseDouble(milesInput.getText());
                double gallonsVar = Double.parseDouble(gallonsInput.getText());
                double MPGVar = milesVar / gallonsVar;
                String MPGOutput = Double.toString(MPGVar);
                milesPerGallonOutput.setText(MPGOutput);
            }
        });        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}