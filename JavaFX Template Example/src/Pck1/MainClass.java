package Pck1;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MainClass extends Application {
	
	final int X_SIZE = 550;
	final int Y_SIZE = 440;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		Pane p = Utility.createPane(190, 190, 190);
		
		HBox hb = Utility.createHBox(170, 170, 170);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		Utility.createStage(stage, scene, "Template");
	}
}
