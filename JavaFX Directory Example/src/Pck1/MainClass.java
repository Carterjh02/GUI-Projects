package Pck1;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class MainClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(final Stage stage) {
		final Label lbSelectedDirectory = new Label();
		lbSelectedDirectory.setLayoutX(50);
		lbSelectedDirectory.setLayoutY(20);
		
		Button btnOpenDirectoryChooser = new Button("Open Directory Chooser");
		btnOpenDirectoryChooser.setLayoutX(80);
		btnOpenDirectoryChooser.setLayoutY(80);
		
		btnOpenDirectoryChooser.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				DirectoryChooser directoryChooser = new DirectoryChooser();
				File selectedDirectory = directoryChooser.showDialog(stage);
			
			if(selectedDirectory == null) {
				lbSelectedDirectory.setText("No Directory selected");
			}else {
				lbSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
			}
			}
			});
		
		Pane root = new Pane();
		root.getChildren().addAll(lbSelectedDirectory, btnOpenDirectoryChooser);
		
		Scene scene = new Scene(root, 300, 250);
		stage.setScene(scene);
		stage.setTitle("Directory");
		stage.show();
		}
	}

