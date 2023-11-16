package Pck1;

import javax.management.timer.Timer;

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

public class MainClass extends Application {
	
	final int stageWidth = 1000;
	final int stageHeight = 720;
	final int paneWidth = stageWidth - 100;
	final int paneHeight = stageHeight - 100;
	
	public Pane p;
	
	public Circle coinCircleL;
	public Circle coinCircleR;
	public Circle dekuCircle;
	public Circle bakuCircle;

	public static void main(String[] args) {
		
		launch(args);

	}

	public void start(Stage stage) {
		Image bgImg = new Image("mhaBackground.jpeg");
		Image dekuImgL = new Image("dekuImgRight.jpeg");
		Image dekuImgR = new Image("dekuImgLeft.jpg");
		Image bakuImg = new Image("bakuImg1.jpeg");
		Image coinImgR = new Image("CoinR.jpg");
		Image coinImgL = new Image("CoinL.jpg");
		
		coinCircleL = new Circle(250, 200, 35);
		coinCircleL.setStroke(null);
		coinCircleL.setFill(new ImagePattern(coinImgL));
		
		coinCircleR = new Circle (550, 250, 35);
		coinCircleR.setStroke(null);
		coinCircleR.setFill(new ImagePattern(coinImgR));
		
		bakuCircle = new Circle(350, 475, 55);
		bakuCircle.setStroke(null);
		bakuCircle.setFill(new ImagePattern(bakuImg));
		
		dekuCircle = new Circle(75, 475, 55);
		dekuCircle.setStroke(null);
		dekuCircle.setFill(new ImagePattern(dekuImgR));
		
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
		p.getChildren().addAll(dekuCircle, coinCircleR, coinCircleL, bakuCircle);
		
		Timer t = new Timer();
		
		Button btnStart = new Button("Start");
		btnStart.setOnAction((ActionEvent e) -> {t.start(); });
		btnStart.setFocusTraversable(false);
		
		Button btnStop = new Button("Stop");
		btnStop.setOnAction((ActionEvent e) -> {t.stop(); });
		btnStop.setFocusTraversable(false);
		
		Button btnLeft = new Button("Left");
		btnLeft.setFocusTraversable(false);
		btnLeft.setOnAction((ActionEvent e) -> {
		dekuCircle.setCenterX(dekuCircle.getCenterX() - 10);
		dekuCircle.setFill(new ImagePattern(dekuImgL));
		});
		
		Button btnRight = new Button("Right");
		btnRight.setFocusTraversable(false);
		btnRight.setOnAction((ActionEvent e) -> {
		dekuCircle.setCenterX(dekuCircle.getCenterX() + 10);
		dekuCircle.setFill(new ImagePattern(dekuImgR));
		});
		
		Button btnUp = new Button("Up");
		btnUp.setFocusTraversable(false);
		btnUp.setOnAction((ActionEvent e) -> {
		dekuCircle.setCenterY(dekuCircle.getCenterY() -10);
		});
		
		Button btnDown = new Button("Down");
		btnDown.setFocusTraversable(false);
		btnDown.setOnAction((ActionEvent e) -> {
		dekuCircle.setCenterY(dekuCircle.getCenterY() + 10);
		});
		
		HBox hb = new HBox();
		hb.setMinSize(100,  50);
		hb.setPadding(new Insets(10, 10, 10, 10));
		hb.setSpacing(7);
		hb.setBackground(new Background(new BackgroundFill(Color.rgb(150,  200, 
				150), null, null)));
		hb.getChildren().addAll(btnStart, btnStop, btnLeft, btnRight, btnUp, btnDown);
		
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
					int y = (int) dekuCircle.getCenterY();
					if (boundaryCheck(y, 'u') == true) {
						dekuCircle.setCenterY(y - 15);
					}
					break;
				case DOWN:
					y = (int) dekuCircle.getCenterY();
					if (boundaryCheck(y, 'd') == true) {
						dekuCircle.setCenterY(y + 15);
					}
					break;
				case RIGHT:
					dekuCircle.setFill(new ImagePattern(dekuImgR));
					int x = (int) dekuCircle.getCenterX();
					if(boundaryCheck(x, 'r') == true) {
						dekuCircle.setCenterX(x + 15);
					}
					break;
				case LEFT:
					dekuCircle.setFill(new ImagePattern(dekuImgL));
					x = (int) dekuCircle.getCenterX();
				if (boundaryCheck(x, 'l') == true) {
					dekuCircle.setCenterX(x - 15);
				}
				break;
				case SPACE:
					x = (int) dekuCircle.getCenterX();
					y = (int) dekuCircle.getCenterY();
					dekuCircle.setCenterY(y - 80); 
					dekuCircle.setCenterX(x + 20); 
					default:
					}
				}
			});
		stage.setScene(scene);
		stage.setTitle("Pr5");
		stage.setWidth(stageWidth);
		stage.setHeight(stageHeight);
		stage.show();
	}
		
	public boolean boundaryCheck(int v, char move) {
		if ( move == 'l') {
			if (v - 20 < 0) {
				return false;
			} }
		if (move == 'r') {
				if (v + 20 > paneWidth) {
					return false;
				} }
		if (move == 'u') {
			if (v - 20 < 20) {
				return false;
			} }
		if (move == 'd') {
			if (v + 20 > 495) {
				return false;
			} }
		return true;
		}
	}


