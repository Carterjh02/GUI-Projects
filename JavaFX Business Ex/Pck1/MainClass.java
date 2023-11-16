package Pck1;

import java.util.ArrayList;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	final int stageWidth = 1000;
	final int stageHeight = 720;
	final int paneWidth = stageWidth - 100;
	final int paneHeight = stageHeight - 120;
	
	public Font font11;
	public Font font12;
	
	public Font font14;
	public Font font18;
	
	public Label lbRecord;
	public Label lbId;
	public Label lbFirstName;
	public Label lbLastName;
	
	public Pane p;
	public TextArea tA;
	public TextField tfId;
	public TextField tfFirstName;
	public TextField tfLastName;
	
	public static ArrayList<Person> list;

	public static void main(String[] args) {
		
		list = new ArrayList<Person>(10);
		launch();

	}
	
	public void start(Stage stage) {
		
		font11 = Font.font("verdana", FontWeight.NORMAL,
				FontPosture.REGULAR, 11);
		font12 = Font.font("verdana", FontWeight.NORMAL, 
				FontPosture.REGULAR, 12);
		
		font14 = Font.font("verdana", FontWeight.BOLD,
				FontPosture.REGULAR, 14);
		font18 = Font.font("verdana", FontWeight.BOLD,
				FontPosture.REGULAR, 18);
		
		lbRecord = new Label("Records:");
		lbRecord.setLayoutX(25);
		lbRecord.setLayoutY(20);
		lbRecord.setFont(font18);
		
		lbId = new Label("Id:");
		lbId.setLayoutX(550);
		lbId.setLayoutY(55);
		lbId.setFont(font18);
		
		lbFirstName = new Label("First Name:");
		lbFirstName.setLayoutX(550);
		lbFirstName.setLayoutY(100);
		lbFirstName.setFont(font18);
		
		lbLastName = new Label("Last Name:");
		lbLastName.setLayoutX(550);
		lbLastName.setLayoutY(145);
		lbLastName.setFont(font18);
		
		TextField tfId = new TextField();
		tfId.setLayoutX(670);
		tfId.setLayoutY(55);
		
		TextField tfFirstName = new TextField();
		tfFirstName.setLayoutX(670);
		tfFirstName.setLayoutY(100);
		
		TextField tfLastName = new TextField();
		tfLastName.setLayoutX(670);
		tfLastName.setLayoutY(145);
		
		TextArea tA = new TextArea();
		tA.setPrefRowCount(20);
		tA.setLayoutX(25);
		tA.setLayoutY(50);
		tA.setMinSize(500, 400);
		tA.setFont(font12);
		
		Button btnClear = new Button("Clear");
		btnClear.setFont(font18);
		btnClear.setFocusTraversable(false);
		btnClear.setLayoutX(25);
		btnClear.setLayoutY(475);
		
		Button btnShow = new Button("Show List");
		btnShow.setFont(font18);
		btnShow.setFocusTraversable(false);
		btnShow.setLayoutX(125);
		btnShow.setLayoutY(475);
		
		Button btnSubmit = new Button("Submit");
		btnSubmit.setFont(font18);
		btnSubmit.setFocusTraversable(false);
		btnSubmit.setLayoutX(550);
		btnSubmit.setLayoutY(220);
		
		p = new Pane();
		p.setMinSize(paneWidth, paneHeight);
		p.setBackground(new Background(new BackgroundFill(Color.rgb(175, 175, 175),
				null, null)));
		p.getChildren().addAll(lbRecord, tA);
		p.getChildren().addAll(lbId, tfId);
		p.getChildren().addAll(lbFirstName, tfFirstName);
		p.getChildren().addAll(lbLastName, tfLastName);
		p.getChildren().addAll(btnClear, btnShow, btnSubmit);
		
		btnClear.setOnAction((ActionEvent e) -> {
		try {
				tA.clear();
		} catch (Exception ex) {
			tA.setText(ex.toString());
		}
		});
		btnShow.setOnAction((ActionEvent e) -> {
			try {
				tA.clear();
				String buffer = "";
				for (int i = 0; i < list.size(); i++) {
					buffer += list.get(i).id + "\n";
					buffer += list.get(i).firstName + " " + list.get(i).lastName 
							+"\n\n";
				}
				
				tA.setText(buffer);
			} catch(Exception ex) {
				tA.setText(ex.toString());
			}
			});
		
		btnSubmit.setOnAction((ActionEvent e) -> {
			try {
				String buf = tA.getText() + "\n";
				buf += tfId.getText() + "\n";
				buf += tfFirstName.getText() + "\n";
				buf += tfLastName.getText() + "\n";
				tA.setText(buf);
				
				list.add(new Person(tfId.getText(),
						tfFirstName.getText(),
						tfLastName.getText()));
			} catch(Exception ex) {
				tA.setText(ex.toString());
			}
		});
		
		VBox vb = new VBox();
		vb.setPadding(new Insets(15, 15, 15, 15));
		vb.setSpacing(15);
		vb.setBackground(new Background(new BackgroundFill(Color.rgb(100, 100, 100), null, null)));
		vb.getChildren().addAll(p);
		
		Scene scene = new Scene(vb);
		stage.setScene(scene);
		stage.setTitle("URL");
		stage.setWidth(1100.0);
		stage.setHeight(700.0);
		stage.show();
		
	}
}