package Pck1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainClass extends Application {
	
	String buffer;
	Font font14;
	Font font18;
	
	Color lightGreen;
	Color midGreen;
	Color green;
	Color lightGray;
	Color gray;
	
	Background bgLightGreen;
	Background bgMidGreen;
	Background bgGreen;
	Background bgLightGray;
	Background bgGray;
	
	Insets pad = new Insets(15, 15, 15, 15);

	public static void main(String[] args) {
		launch(args);
	}

	public void init() {
		green = Color.rgb(150,  200, 150);
		midGreen = Color.rgb(180,  200, 180);
		lightGreen = Color.rgb(200,  230, 200);
		lightGray = Color.rgb(190, 190, 190);
		gray = Color.rgb(100,  100, 100);
		
		font14 = Font.font("verdana", FontWeight.BOLD, 
				FontPosture.REGULAR, 14);
		font18 = Font.font("verdana", FontWeight.BOLD, 
				FontPosture.REGULAR, 18);
		
		bgLightGreen = new Background(new BackgroundFill(lightGreen, null, null));
		bgMidGreen = new Background(new BackgroundFill(midGreen, null, null));
		bgGreen = new Background(new BackgroundFill(green, null, null));
		bgLightGray = new Background(new BackgroundFill(lightGray, null, null));
		bgGray = new Background(new BackgroundFill(gray, null, null));	
	}
	
	public void start(Stage stage) {
		Label lblRadio = new Label("Radio Buttons:");
		lblRadio.setFont(font18);
		
		Label lblChkBox = new Label("Check Box");
		lblChkBox.setFont(font18);
		
		Label lblStatus1 = new Label("Status 1");
		lblStatus1.setFont(font18);
		lblStatus1.setLayoutX(10);
		lblStatus1.setLayoutY(200);
		
		Label lblStatus2 = new Label("Status 2");
		lblStatus2.setFont(font18);
		lblStatus2.setLayoutX(10);
		lblStatus2.setLayoutY(230);
		
			ToggleGroup group = new ToggleGroup();
		
		RadioButton rb1 = new RadioButton("Radio Btn 1");
		rb1.setToggleGroup(group);
		rb1.setSelected(true);
		
		RadioButton rb2 = new RadioButton("Radio Btn 2");
		rb2.setToggleGroup(group);
		
		CheckBox chkBox1 = new CheckBox("Check Box 1");
		CheckBox chkBox2 = new CheckBox("Check Box 2");
		
		VBox vbRadioBtn = new VBox(15);
		vbRadioBtn.setPadding(pad);
		vbRadioBtn.setBackground(bgLightGreen);
		vbRadioBtn.setPrefSize(180, 120);
		vbRadioBtn.setLayoutX(30);
		vbRadioBtn.setLayoutY(20);
		vbRadioBtn.getChildren().addAll(lblRadio, rb1, rb2);
		
		VBox vbCheckBtn = new VBox(15);
		vbCheckBtn.setPadding(pad);
		vbCheckBtn.setBackground(bgLightGreen);
		vbCheckBtn.setPrefSize(180, 120);
		vbCheckBtn.setLayoutX(250);
		vbCheckBtn.setLayoutY(20);
		vbCheckBtn.getChildren().addAll(lblChkBox, chkBox1, chkBox2);
		
		Pane p = new Pane();
		p.setMinSize(300, 325);
		p.setBackground(bgMidGreen);
		p.getChildren().addAll(vbRadioBtn, vbCheckBtn, lblStatus1, lblStatus2);
		
		Button btnStatus = new Button("Status");
		btnStatus.setFocusTraversable(false);
		
		HBox hb= new HBox();
		hb.setMinSize(100, 50);
		hb.setPadding(pad);
		hb.setSpacing(7);
		hb.setBackground(bgGreen);
		hb.getChildren().addAll(btnStatus);
		
		VBox vb = new VBox();
		vb.setPadding(pad);
		vb.setSpacing(15);
		vb.setBackground(bgGray);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb);
		stage.setScene(scene);
		stage.setTitle("Radio Buttons and Check Boxes");
		stage.setWidth(550.0);
		stage.setHeight(440.0);
		stage.show();
		
		btnStatus.setOnAction((ActionEvent e) -> {
			try {
				buffer = "";
				if(rb1.isSelected())
				{
					buffer = "Radio Button 1 is selected";
				}
				else if (rb2.isSelected()) {
					buffer = "Radio Button 2 is selected";
				}
				lblStatus1.setText(buffer);
				
				buffer = "";
				if(chkBox1.isSelected()) {
					buffer = "chkBox1 is selected"; }
				if (chkBox2.isSelected()) {
					buffer += "chkBox2 is selected"; }
				lblStatus2.setText(buffer);
				
			}catch(Exception ex) {
				}
			});
		}
		
	}
	
