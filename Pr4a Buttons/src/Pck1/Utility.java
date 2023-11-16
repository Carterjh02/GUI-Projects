//Carter Howell
//COP2800 T/TH
//October 27, 2023

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
	
	public static HBox createHBox1(int r, int g, int b) {
		HBox hb1 = new HBox(10);
		hb1.setBackground(createBgColor(r, g, b));
		hb1.setMinSize(X_SIZE -20, 50);
		return hb1;
	}
	
	public static HBox createHBox2(int r, int g, int b) {
		HBox hb2 = new HBox(10);
		hb2.setBackground(createBgColor(r, g, b));
		hb2.setMinSize(X_SIZE -20, 50);
		return hb2;
	}
	
	public static void createStage(Stage stage, Scene scene, String title) {
		stage.setScene(scene);
		stage.setTitle(title);
		stage.setWidth(X_SIZE);
		stage.setHeight(Y_SIZE);
		stage.show();
	}
}
