package Pck1;

import javafx.application.Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;

import javafx.event.ActionEvent;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

import javafx.geometry.Insets;

import javafx.stage.Stage;

public class MainClass extends Application {
	
	public static double X;
	public static double Y;
	
	public static URL aURL;
	public static BufferedReader in;
	
	public Stage stage2;
	public Stage stage3;
	
	public Font font11;
	public Font font12;
	public Font font18;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		
		createFonts();
		
		Label lblHost = new Label("Host:");
		lblHost.setLayoutX(100);
		lblHost.setLayoutY(10);
		lblHost.setFont(font18);
		
		TextArea tA = new TextArea();
		tA.setPrefRowCount(20);
		tA.setLayoutX(10);
		tA.setLayoutY(50);
		tA.setMinSize(1000, 400);
		
		Pane p = new Pane();
		p.setMinSize(1000, 500);
		p.setBackground(new Background(new 
				BackgroundFill(Color.rgb(150, 150,150), null, null)));
		p.getChildren().addAll(lblHost, tA);
		
		Button btnSubmit = new Button("Submit");
		btnSubmit.setFocusTraversable(false);
		
		Button btnStats = new Button("Stats");
		btnStats.setFocusTraversable(false);
		
		Button btnPing = new Button("Ping");
		btnPing.setFocusTraversable(false);
		
		Button btnTraceRoute = new Button("Trace Route");
		btnTraceRoute.setFocusTraversable(false);
		
		Button btnClear = new Button("Clear");
		btnSubmit.setFocusTraversable(false);
		
		HBox hb = new HBox();
		hb.setMinSize(100, 50);
		hb.setPadding(new Insets(10, 10, 10, 10));
		hb.setSpacing(7);
		hb.setBackground(new Background(new 
				BackgroundFill(Color.rgb(150, 150, 150), null, null)));
		hb.getChildren().addAll(p, hb);
		
		VBox vb = new VBox();
		vb.setPadding(new Insets(15, 15, 15, 15));
		vb.setSpacing(15);
		vb.setBackground(new Background(new 
				BackgroundFill(Color.rgb(100,  100, 100), null, null)));
		vb.getChildren().addAll(p, hb);
		
		CreatePrimaryStage(stage, vb);
		
		btnStats.setOnAction((ActionEvent e) -> {
			String buffer = "";
			buffer += ("protocol = " + aURL.getProtocol()) + "\n";
			buffer += ("authority = " + aURL.getAuthority()) + "\n";
			buffer += ("host = " + aURL.getHost()) + "\n";
			buffer += ("port = " + aURL.getPort()) + "\n";
			buffer += ("path = " + aURL.getPath()) + "\n";
			buffer += ("query = " + aURL.getQuery()) + "\n";
			buffer += ("filename = " + aURL.getFile()) + "\n";
			buffer += ("ref = " + aURL.getRef()) + "\n";
			
			tA.setText(buffer);
		});
		
		btnSubmit.setOnAction((ActionEvent e) -> {
			try {
				aURL = new URL("http://cisyt.com" + "/java.php");
				in = new BufferedReader(new
						InputStreamReader(aURL.openStream()));
				String buf = "";
				String inputLine;
			while ((inputLine = in.readLine()) != null)
				buf+= inputLine + "\n";
			
			tA.setText(buf);
			lblHost.setText(aURL.getHost());
			} catch (Exception ex) {
				tA.setText(ex.toString());
			}	
		});
		
		btnClear.setOnAction((ActionEvent e) -> {
			stage2.close();
			stage3.close();
			tA.clear();
		});
		
		btnPing.setOnAction((ActionEvent e) -> {
			try {
				Runtime r = Runtime.getRuntime();
				Process pr = r.exec("ping -a -c 3 cisyst.com");
				BufferedReader in = new BufferedReader(new 
						InputStreamReader(pr.getInputStream()));
				
		String pingResult = "";
		String buffer;
		while ((buffer = in.readLine()) != null) {
			pingResult += buffer + "\n";
		}
		
		in.close();
		
		CreatePingStage(pingResult);
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		});
		
		btnTraceRoute.setOnAction((ActionEvent e) -> {
			try {
				Runtime tr = Runtime.getRuntime();
				Process pr = tr.exec("traceroute cisyst.com");
				BufferedReader in = new BufferedReader( new
						InputStreamReader(pr.getInputStream()));
				
			String results = "";
			String buffer;
			while ((buffer = in.readLine()) != null) {
				results += buffer + "\n";
			}
			
			in.close();
			createTraceRouteStage(results);
			
			} catch(IOException e1) {
				e1.printStackTrace();
			}
			
		});
	}
	
	public void CreatePrimaryStage(Stage stage, VBox vb) {
		Scene scene = new Scene(vb);
		stage.setScene(scene);;
		stage.setTitle("URL");
		stage.setWidth(1100.0);
		stage.setHeight(700.0);
		stage.show();
		
		X = stage.getX();
		Y = stage.getY();
	}
	
	public void CreatePingStage(String buffer) {
		TextArea tA = new TextArea();
		tA.setFont(font11);
		tA.setPrefRowCount(20);
		tA.setLayoutX(10);
		tA.setLayoutY(50);
		tA.setMinSize(300,  200);
		tA.setText(buffer);;
		
		Scene scene2 = new Scene(tA);
		stage2 = new Stage();
		stage2.setTitle("Ping");
		stage2.setScene(scene2);
		stage2.setWidth(400.0);
		stage2.setHeight(300.0);
		stage2.setX(X + 80);
		stage2.setY(Y + 50);
		stage2.setAlwaysOnTop(true);
		
		stage2.show();
	}
	
	public void createTraceRouteStage(String buffer) {
		
		TextArea tA = new TextArea();
		tA.setFont(font11);
		tA.setPrefRowCount(20);
		tA.setLayoutX(10);
		tA.setLayoutY(50);
		tA.setMinSize(450, 200);
		tA.setText(buffer);;
		
		Scene scene3 = new Scene(tA);
		stage3 = new Stage();
		stage3.setTitle("Trace Route");
		stage3.setScene(scene3);
		stage3.setWidth(600.0);
		stage3.setHeight(300.0);
		stage3.setX(X + 520);
		stage3.setY(Y + 50);
		stage3.setAlwaysOnTop(true);
		
		stage3.show();
	}
	
	public void createFonts() {
		font11 = Font.font("verdana", FontWeight.NORMAL, 
				FontPosture.REGULAR, 11);
		font12 = Font.font("verdana", FontWeight.NORMAL, 
				FontPosture.REGULAR, 12);
		font18 = Font.font("verdana", FontWeight.BOLD, 
				FontPosture.REGULAR, 18);
		
	}
}
