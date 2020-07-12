/*
Todd J Myers
06/02/20
Temperature converter from Fahrenheit and Celsius 
*/
package application;


import javafx.geometry.Insets;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class TempConverter extends Application 

{
	
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		launch(args);
		}
		 
		public void start(Stage stage) 
		{
			
			GridPane root = new GridPane();
			root.setPadding(new Insets(0,10,0,10));
			root.setHgap(5);
			root.setVgap(5);
			
			Button btn = new Button();
			btn.setText("Convert");
			GridPane.setConstraints(btn,0,8);
			
			Label F = new Label();
			F.setText("Fahrenheit");
			GridPane.setConstraints(F,0,3);
			TextField Input1 = new TextField();
			GridPane.setConstraints(Input1,0,4);
			
			Label C = new Label();
			C.setText("Celsius");
			GridPane.setConstraints(C,5,3);
			TextField Input2 = new TextField();
			GridPane.setConstraints(Input2,5,4);

			Label Output = new Label();
			GridPane.setConstraints(Output,0,1);
			
			ToggleGroup radioButtons = new ToggleGroup();
		
	
			btn.setOnAction(new EventHandler<ActionEvent>()
			  {
				 @Override public void handle(ActionEvent e) 
				 {
        String temp = Input1.getText(); 
        double fahrenheit = Double.parseDouble(temp);// (Converts the string into an actual double object you can use)
        double celsius = (fahrenheit - 32.0) * (5.0/9.0); 
        Input2.setText(Double.toString(celsius)); //(This sets the Celsius text box to the converted value)

				 
				 }
				
				
			  });
				
			
			
root.getChildren().addAll(Output,Input1,Input2,btn,F,C);
			
			stage.setTitle("Temperature Converter");
			Label label = new Label();
			StackPane pane  = new StackPane();
			Scene scene = new Scene(root, 250, 150);
			stage.setScene(scene);
			stage.show();
		}
		
		}
