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
		
		Button btnMoveR = new Button("Move right");
		btnMoveR.setFocusTraversable(false);
		btnMoveR.setOnAction((ActionEvent e) -> {
			c1.setCenterX(c1.getCenterX() + 10);
		});
		
		Button btnMoveL = new Button("Move left");
		btnMoveL.setFocusTraversable(false);
		btnMoveL.setOnAction((ActionEvent e) -> {
			c1.setCenterX(c1.getCenterX() - 10);
		});
		
		Button btnMoveD = new Button("Move down");
		btnMoveD.setFocusTraversable(false);
		btnMoveD.setOnAction((ActionEvent e) -> {
			c1.setCenterY(c1.getCenterY() + 10);
		});
		
		Button btnMoveU = new Button("Move up");
		btnMoveU.setFocusTraversable(false);
		btnMoveU.setOnAction((ActionEvent e) -> {
			c1.setCenterY(c1.getCenterY() -10);
		});
		
		Pane p = Utility.createPane(190, 190, 190);
		p.getChildren().addAll(c1, c2);
		
		HBox hb = Utility.createHBox(170, 170, 170);
		hb.getChildren().addAll(btnMoveR, btnMoveL, btnMoveU, btnMoveD);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		Utility.createStage(stage, scene, "Template");
	}
}
