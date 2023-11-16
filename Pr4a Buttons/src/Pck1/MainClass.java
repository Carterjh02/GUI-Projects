//Carter Howell
//COP2800 T/TH
//October 27, 2023

package Pck1;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.*;

public class MainClass extends Application {
	
	final int X_SIZE = 550;
	final int Y_SIZE = 440;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		
		Circle c1 = CircleClass.createCircle(75, 75, 20, 250, 250, 10);
		Circle c2 = CircleClass.createCircle(200, 200, 40, 250, 10, 10);
		
		Button btnYMoveR = new Button("Move yellow right");
		btnYMoveR.setFocusTraversable(false);
		btnYMoveR.setOnAction((ActionEvent e) -> {
			c1.setCenterX(c1.getCenterX() + 10);
		});
		
		Button btnYMoveL = new Button("Move yellow left");
		btnYMoveL.setFocusTraversable(false);
		btnYMoveL.setOnAction((ActionEvent e) -> {
			c1.setCenterX(c1.getCenterX() - 10);
		});
		
		Button btnYMoveD = new Button("Move yellow down");
		btnYMoveD.setFocusTraversable(false);
		btnYMoveD.setOnAction((ActionEvent e) -> {
			c1.setCenterY(c1.getCenterY() + 10);
		});
		
		Button btnYMoveU = new Button("Move yellow up");
		btnYMoveU.setFocusTraversable(false);
		btnYMoveU.setOnAction((ActionEvent e) -> {
			c1.setCenterY(c1.getCenterY() -10);
		});
		
		Button btnRMoveR = new Button("Move red right");
		btnRMoveR.setFocusTraversable(false);
		btnRMoveR.setOnAction((ActionEvent e) -> {
			c2.setCenterX(c2.getCenterX() + 10);
		});
		
		Button btnRMoveL = new Button("Move red left");
		btnRMoveL.setFocusTraversable(false);
		btnRMoveL.setOnAction((ActionEvent e) -> {
			c2.setCenterX(c2.getCenterX() - 10);
		});
		
		Button btnRMoveD = new Button("Move red down");
		btnRMoveD.setFocusTraversable(false);
		btnRMoveD.setOnAction((ActionEvent e) -> {
			c2.setCenterY(c2.getCenterY() + 10);
		});
		
		Button btnRMoveU = new Button("Move red up");
		btnRMoveU.setFocusTraversable(false);
		btnRMoveU.setOnAction((ActionEvent e) -> {
			c2.setCenterY(c2.getCenterY() -10);
		});
		
		Pane p = Utility.createPane(190, 190, 190);
		p.getChildren().addAll(c1, c2);
		
		HBox hb1 = Utility.createHBox1(170, 170, 170);
		hb1.getChildren().addAll(btnYMoveR, btnYMoveL, btnYMoveU, btnYMoveD);
		
		HBox hb2 = Utility.createHBox2(170, 170, 170);
		hb2.getChildren().addAll(btnRMoveR, btnRMoveL, btnRMoveU, btnRMoveD);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb1, hb2);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		Utility.createStage(stage, scene, "Pr4a");
	}
}
