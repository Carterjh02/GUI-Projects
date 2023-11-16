package Pck1;

import java.util.ArrayList;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.*;


public class MainClass extends Application {
	
	final int stageWidth = 1000;
	final int stageHeight = 720;
	final int paneWidth = stageWidth - 100;
	final int paneHeight = stageHeight - 120;
	
	public static ArrayList<Person> list;

	public static void main(String[] args) {
		list = new ArrayList<Person>(10);
		launch(args);

	}
	
	public void start(Stage stage) {
		
		Label lbRecord = new Label("Records: ");
		lbRecord.setLayoutX(25);
		lbRecord.setLayoutY(20);
		
		Label lbId = new Label("Id: ");
		lbId.setLayoutX(550);
		lbId.setLayoutY(55);
		
		Label lbFirstName = new Label("First Name: ");
		lbFirstName.setLayoutX(550);
		lbFirstName.setLayoutY(100);
		
		
		Label lbLastName = new Label("Last Name: ");
		lbLastName.setLayoutX(550);
		lbLastName.setLayoutY(145);
		
		TextField tfFirstName = new TextField();
		tfFirstName.setLayoutX(650);
		tfFirstName.setLayoutY(100);
		
		TextField tfLastName = new TextField();
		tfLastName.setLayoutX(650);
		tfLastName.setLayoutY(145);
		
		TextField tfId = new TextField();
		tfId.setLayoutX(650);
		tfId.setLayoutY(55);
		
		TextArea taRecord = new TextArea();
		taRecord.setPrefRowCount(18);
		taRecord.setLayoutX(25);
		taRecord.setLayoutY(50);
		taRecord.setMinSize(500, 500);
		
		Button btnSubmit = new Button("Submit");
		btnSubmit.setFocusTraversable(false);
		
		Button btnClear = new Button("Clear");
		btnClear.setFocusTraversable(false);
		
		Button btnShow = new Button("Show");
		btnShow.setFocusTraversable(false);
		
		Button btnSearch = new Button("Search");
		btnSearch.setFocusTraversable(false);
		
		Pane p = Utility.createPane(195, 195,  195);
		p.getChildren().addAll(tfFirstName, lbFirstName, 
				lbLastName, tfLastName, lbId, tfId, taRecord);
		p.setMinSize(paneWidth, paneHeight);
		
		btnClear.setOnAction((ActionEvent e) -> {
			try {
					taRecord.clear();
			} catch (Exception ex) {
				taRecord.setText(ex.toString());
			}
			});
			btnSubmit.setOnAction((ActionEvent e) -> {
				String Id = tfId.getText();
				String firstName = tfFirstName.getText();
				String lastName = tfLastName.getText();
				
				list.add(new Person(Id, firstName, lastName));
					});
			
			btnShow.setOnAction((ActionEvent e) -> {
				try {
					String buf = taRecord.getText() + "\n";
					buf += tfId.getText() + "\n";
					buf += tfFirstName.getText() + " ";
					buf += tfLastName.getText() + "\n\n";
					taRecord.setText(buf);
				} catch(Exception ex) {
					taRecord.setText(ex.toString());
				}
			});
			
			btnSearch.setOnAction((ActionEvent e) -> {;
			taRecord.clear();
			
			String ID = tfId.getText();
			String buffer = "";
			
			for(int i = 0; i < list.size(); i++) { 
				
				Person pl = list.get(i);
				if (pl.id.equals(ID) == true) {
					buffer += pl.id + "\n" + pl.firstName + " " + pl.lastName + "\n\n";
					taRecord.setText(buffer);
					break;
			}
			}
			
			});
		
		HBox hb = Utility.createHBox(195, 195, 195);
		hb.getChildren().addAll(btnSubmit, btnClear, btnShow, btnSearch);
		
		VBox vb = new VBox(10);
		vb.setPadding(new Insets(15, 15, 15, 15));
		vb.setSpacing(15);
		vb.setBackground(new Background(new BackgroundFill(Color.rgb(100, 100, 100), null, null)));
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, stageWidth, stageHeight);
		Utility.createStage(stage, scene, "Business App");
		stage.setWidth(stageWidth);
		stage.setHeight(stageHeight);
		
	}

}
