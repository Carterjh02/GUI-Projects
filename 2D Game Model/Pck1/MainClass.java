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
	final int paneHeight = stageHeight - 120;
	
	Pane p;
	
	Circle goombaCircle;
	Circle mushroomCircle;
	Circle coinCircleL;
	Circle coinCircleR;
	Circle marioCircle;

	public static void main(String[] args) {
		
		launch(args);
	}

	public void start(Stage stage) {
		Image bgImg = new Image("background.jpg");
		Image coinImgL = new Image("CoinL.jpg");
		Image coinImgR = new Image("CoinR.jpg");
		Image mushroomImg = new Image("Mushroom.png");
		Image goombaImg = new Image("Goomba.png");
		Image marioLImg = new Image("MarioL.png");
		Image marioRImg = new Image("MarioR.png");
		
		coinCircleL = new Circle(250, 200, 40);
		coinCircleL.setStroke(null);
		coinCircleL.setFill(new ImagePattern(coinImgL));
		
		coinCircleR = new Circle(675, 120, 40);
		coinCircleR.setStroke(null);
		coinCircleR.setFill(new ImagePattern(coinImgR));
		
		mushroomCircle = new Circle(450, 270, 40);
		mushroomCircle.setStroke(null);
		mushroomCircle.setFill(new ImagePattern(mushroomImg));
		
		goombaCircle = new Circle(850, 400, 40);
		goombaCircle.setStroke(null);
		goombaCircle.setFill(new ImagePattern(goombaImg));
		
		marioCircle = new Circle(75, 475, 55);
		marioCircle.setStroke(null);
		marioCircle.setFill(new ImagePattern(marioRImg));
		
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
		p.getChildren().addAll(goombaCircle, mushroomCircle, coinCircleL, coinCircleR);
		p.getChildren().add(marioCircle);
		
		Timer t = new Timer();
		
		Button btnStart = new Button("Start");
		btnStart.setOnAction((ActionEvent e) -> {t.start(); });
		btnStart.setFocusTraversable(false);
		
		Button btnStop = new Button("Stop");
		btnStop.setOnAction((ActionEvent e) -> {t.stop(); });
		btnStop.setFocusTraversable(false);
		
		HBox hb = new HBox();
		hb.setMinSize(100,  50);
		hb.setPadding(new Insets(10, 10, 10, 10));
		hb.setSpacing(7);
		hb.setBackground(new Background(new BackgroundFill(Color.rgb(150,  200, 
				150), null, null)));
		hb.getChildren().addAll(btnStart, btnStop);
		
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
					int y = (int) marioCircle.getCenterY();
					if (boundaryCheck(y, 'u') == true) {
						marioCircle.setCenterY(y -20);
					}
					break;
				case DOWN:
					y = (int) marioCircle.getCenterY();
					if (boundaryCheck(y, 'd') == true) {
						marioCircle.setCenterY(y + 20);
					}
					break;
				case RIGHT:
					marioCircle.setFill(new ImagePattern(marioRImg));
					int x = (int) marioCircle.getCenterX();
					if(boundaryCheck(x, 'r') == true) {
						marioCircle.setCenterX(x + 20);
					}
					break;
				case LEFT:
					marioCircle.setFill(new ImagePattern(marioLImg));
					x = (int) marioCircle.getCenterX();
				if (boundaryCheck(x, 'l') == true) {
					marioCircle.setCenterX(x - 20);
				}
				break;
				case SPACE:
					x = (int) marioCircle.getCenterX();
					y = (int) marioCircle.getCenterY();
					marioCircle.setCenterY(y - 80);
					marioCircle.setCenterX(x + 20);
					default:
				}
			}
		});
		stage.setScene(scene);
		stage.setTitle("2D Game");
		stage.setWidth(stageWidth);
		stage.setHeight(stageHeight);
		stage.show();
	}
	public boolean boundaryCheck(int v, char move) {
		if ( move == 'l') {
			System.out.println("moving left x = " + v);
			if (v - 20 < 0) {
				return false;
			} }
		if (move == 'r') {
			System.out.println("moving right x + " + v);
				if (v + 20 > paneWidth) {
					return false;
				} }
		if (move == 'u') {
			System.out.println("moving up y = " + v);
			if (v - 20 < 20) {
				return false;
			} }
		if (move == 'd') {
			System.out.println("moving down y = " + v);
			if (v + 20 > 495) {
				return false;
			} }
		return true;
		}
	}

