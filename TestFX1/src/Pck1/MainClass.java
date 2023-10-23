package Pck1;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		
		Pane p = new Pane(); //x goes left to right, y goes up to down
		p.setMinSize(425, 250);
		p.setBackground(new Background(
				new BackgroundFill(Color.rgb(190, 220, 190), null, null)));
		
		HBox hb = new HBox();
		hb.setMinSize(100, 50);
		hb.setPadding(new Insets(10, 10, 10, 10));
		hb.setSpacing(7);
		hb.setBackground(new Background(new BackgroundFill(Color.rgb(150,  200, 150), null, null)));
		
		VBox vb = new VBox();
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb);
		
		
		stage.setScene(scene);
		stage.setTitle("Template");
		stage.setWidth(550);
		stage.setHeight(350);
		stage.show();
		
	} //End Start()
}
