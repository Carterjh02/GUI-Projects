
		package testt;

		import javafx.application.*;
		import javafx.scene.Scene;
		import javafx.scene.image.Image;
		import javafx.scene.layout.HBox;
		import javafx.scene.layout.Pane;
		import javafx.scene.layout.VBox;
		import javafx.stage.*;

		public class MainClass extends Utility {
			
			final X_Size = 550;
			final Y_Size = 440;

			public static void main(String[] args) {
				
				launch(args);
			}
			public void start(Stage stage) {
				Image bgImg = new Image("background.jpg");
				Pane p = Utility.createPane(bgImg);
				
				HBox hb = Utility.createHBox(170, 170, 170);
				VBox vb = new VBox(10);
				vb.getChildren().addAll(p,hb);
				
				Scene scene = new Scene(vb, X_SIZE, Y_Size);
				Utility.createStage(stage, scene, "Template");
			}
		}


	}

}
