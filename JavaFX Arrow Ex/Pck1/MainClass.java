package Pck1;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;

import javafx.scene.control.Button;

import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{
	
	final static int stageWidth = 1000;
	final static int stageHeight = 720;
	final static int paneWidth = stageWidth - 100;
	final static int paneHeight = stageHeight - 120;
	
	public static Pane p;
	
	public static Circle goombaCircle;

	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage stage) {

	Image bgImg = new Image("background.jpg");
	Image goombaImg = new Image ("Goomba.png");
	
	goombaCircle = new Circle(850, 400, 40);
	goombaCircle.setStroke(null);
	goombaCircle.setFill(new ImagePattern(goombaImg));
	
	p = new Pane();
	p.setMinSize(paneWidth, paneHeight);
	
	BackgroundSize backgroundSize = new BackgroundSize(paneWidth, 
			paneHeight, true, true, true, false);
	BackgroundImage backgroundImage = new BackgroundImage(bgImg, 
			BackgroundRepeat.REPEAT, 
			BackgroundRepeat.NO_REPEAT, 
			BackgroundPosition.CENTER, 
			backgroundSize);
	p.setBackground(new Background(backgroundImage));
	
	HBox hb = new HBox();
	hb.setMinSize(100,  50);
	hb.setPadding(new Insets(10, 10, 10, 10));
	hb.setSpacing(7);
	hb.setBackground(new Background(new BackgroundFill(Color.rgb(150,  200, 
			150), null, null)));
	
	VBox vb = new VBox();
	vb.setPadding(new Insets(15, 15, 15, 15));
	vb.setSpacing(15);
	vb.setBackground(new Background(new BackgroundFill(
			Color.rgb(100,  100,  100), null, null)));
	vb.getChildren().addAll(p, hb);
	
	Scene scene = new Scene(vb);
	scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
		public void handle(KeyEvent event) {
			switch (event.getCode()) {
			case UP:
				int y = (int) goombaCircle.getCenterY();
					goombaCircle.setCenterY(y -20);
				
				break;
			case DOWN: 
				y = (int) goombaCircle.getCenterY();
					goombaCircle.setCenterY(y + 20);
				
				break;
			case RIGHT:
				int x = (int) goombaCircle.getCenterX();
					goombaCircle.setCenterX(x + 20);
				
				break;
			case LEFT:
				x = (int) goombaCircle.getCenterX();
				goombaCircle.setCenterX(x - 20);
				{
			break; }
			default:
				break;
			
				
			}
	stage.setScene(scene);
	stage.setTitle("2D Game");
	stage.setWidth(stageWidth);
	stage.setHeight(stageHeight);
	stage.show();
			
				
}
		});
	}}
