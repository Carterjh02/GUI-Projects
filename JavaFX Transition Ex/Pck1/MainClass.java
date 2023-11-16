package Pck1;

import javafx.animation.*;
import javafx.animation.PathTransition;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.*;
import javafx.util.Duration;

public class MainClass extends Application {
	
	final int X_SIZE = 550;
	final int Y_SIZE = 440;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		
		Circle pathCircle = CircleClass.createCircle(200,  175,  100,  0,  0,  0);
		pathCircle.setFill(null);
		Circle pathCircle2 = CircleClass.createCircle(275,  150,  100,  0,  0,  0);
		pathCircle2.setFill(null);
		
		Circle c1 = CircleClass.createCircle(120, 125, 30, 255, 255, 0);
		Circle c2 = CircleClass.createCircle(175, 135, 40, 255, 100, 100);
		
		Button start = new Button("Start");
		start.setFocusTraversable(false);
		
		Button stop = new Button("Stop");
		stop.setFocusTraversable(false);
		
		Pane p = Utility.createPane(170, 190, 190);
		p.getChildren().addAll(pathCircle, pathCircle2, c1, c2);
		
		HBox hb = Utility.createHBox(170, 170, 170);
		hb.getChildren().addAll(start, stop);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, Utility.X_SIZE, Utility.Y_SIZE);
		Utility.createStage(stage, scene, "Path Transition");
		
		PathTransition path = new PathTransition();
		path.setDuration(Duration.millis(3000));
		path.setPath(pathCircle);
		path.setNode(c1);
		path.setInterpolator(Interpolator.LINEAR);
		path.setCycleCount(Timeline.INDEFINITE);
		
		PathTransition pth = new PathTransition();
		pth.setDuration(Duration.millis(1500));
		pth.setPath(pathCircle2);
		pth.setNode(c2);
		pth.setInterpolator(Interpolator.LINEAR);
		pth.setCycleCount(Timeline.INDEFINITE);
		
		start.setOnAction((ActionEvent e) -> {path.play(); pth.play(); });
		stop.setOnAction((ActionEvent e) -> {path.stop(); pth.stop(); });
	}
}
