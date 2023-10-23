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
	public Label lbDate;
	public Label lbTime;
	public Label lbTypeOfFood;
	public Label lbAmtOfFood;
	
	public Pane p;
	public TextArea tA;
	public TextField tfDate;
	public TextField tfTime;
	public TextField tfTypeOfFood;
	public TextField tfAmtOfFood;
	
	public static ArrayList<Food> list;

	public static void main(String[] args) {
		
		list = new ArrayList<Food>(10);
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
		
		lbDate = new Label("Date:");
		lbDate.setLayoutX(550);
		lbDate.setLayoutY(55);
		lbDate.setFont(font18);
		
		lbTime = new Label("Time:");
		lbTime.setLayoutX(550);
		lbTime.setLayoutY(100);
		lbTime.setFont(font18);
		
		lbTypeOfFood = new Label("Type of Food:");
		lbTypeOfFood.setLayoutX(550);
		lbTypeOfFood.setLayoutY(145);
		lbTypeOfFood.setFont(font18);
		
		lbAmtOfFood = new Label("Amount of Food:");
		lbAmtOfFood.setLayoutX(550);
		lbAmtOfFood.setLayoutY(190);
		lbAmtOfFood.setFont(font18);
		
		TextField tfDate = new TextField();
		tfDate.setLayoutX(800);
		tfDate.setLayoutY(55);
		
		TextField tfTime = new TextField();
		tfTime.setLayoutX(800);
		tfTime.setLayoutY(100);
		
		TextField tfTypeOfFood = new TextField();
		tfTypeOfFood.setLayoutX(800);
		tfTypeOfFood.setLayoutY(145);
		
		TextField tfAmtOfFood = new TextField();
		tfAmtOfFood.setLayoutX(800);
		tfAmtOfFood.setLayoutY(190);
		
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
		p.setBackground(new Background(new BackgroundFill(Color.rgb(173, 216, 230),
				null, null)));
		p.getChildren().addAll(lbRecord, tA);
		p.getChildren().addAll(lbDate, tfDate);
		p.getChildren().addAll(lbTime, tfTime);
		p.getChildren().addAll(lbTypeOfFood, tfTypeOfFood);
		p.getChildren().addAll(lbAmtOfFood, tfAmtOfFood);
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
					buffer += list.get(i).date + "\n";
					buffer += list.get(i).time + " " + list.get(i).typeOfFood + " " + list.get(i).amtOfFood 
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
				buf += tfDate.getText() + "\n";
				buf += tfTime.getText() + "\n";
				buf += tfTypeOfFood.getText() + "\n";
				buf += tfAmtOfFood.getText() + "\n";
				tA.setText(buf);
				
				list.add(new Food(tfDate.getText(),
						tfTime.getText(),
						tfTypeOfFood.getText(), tfAmtOfFood.getText()));
			} catch(Exception ex) {
				tA.setText(ex.toString());
			}
		});
		
		VBox vb = new VBox();
		vb.setPadding(new Insets(15, 15, 15, 15));
		vb.setSpacing(15);
		vb.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), null, null)));
		vb.getChildren().addAll(p);
		
		Scene scene = new Scene(vb);
		stage.setScene(scene);
		stage.setTitle("Food Diary");
		stage.setWidth(1100.0);
		stage.setHeight(700.0);
		stage.show();
		
	}
}
