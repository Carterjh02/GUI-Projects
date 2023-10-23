package Pck1;

import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Utility {

	final static int X_SIZE = 550;
	final static int Y_SIZE = 440;
	
	public static Background createBgColor(int r, int g, int b) {
		Color color = Color.rgb(r,  g, b);
		Background bgColor = new Background(new
				BackgroundFill(color, null, null));
		return bgColor;
	}
	
	public static Pane createPane(int r, int g, int b) {
		Pane p = new Pane();
		p.setBackground(createBgColor(r, g, b));
		p.setMinSize(X_SIZE, Y_SIZE -100);
		return p;
	}
	
	public static HBox createHBox(int r, int g, int b) {
		HBox hb = new HBox(10);
		hb.setBackground(createBgColor(r, g, b));
		hb.setMinSize(X_SIZE -20, 100);
		return hb;
	}
	
	public static void createStage(Stage stage, Scene scene, String title) {
		stage.setScene(scene);
		stage.setTitle(title);
		stage.setWidth(X_SIZE);
		stage.setHeight(Y_SIZE);
		stage.show();
	}
}
