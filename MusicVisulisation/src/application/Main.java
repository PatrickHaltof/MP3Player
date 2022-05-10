package application;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Main extends Application {
	Map<String, Pane> scenes;
	private Stage primaryStage;
	private String currentScene;

	public void init() {

	}

	@Override
	public void start(Stage primaryStage) {
		try {
			scenes = new HashMap<>();
			this.primaryStage = primaryStage;
			// Erzeugen der Screens/Scenes

			VisualistionViewController visualistionViewController = new VisualistionViewController(this, player);
			scenes.put("VisualisationView", visualistionViewController.getRoot());
			ButtonViewController buttonViewController = new ButtonViewController(this, player);
			scenes.put("ButtonView", buttonViewController.getRoot());
			PlaylistViewController playlistViewController = new PlaylistViewController(this, player);
			scenes.put("PlaylistView", playlistViewController.getRoot());
			SettingViewController settingViewController = new SettingViewController(this, player);
			scenes.put("SettingView", settingViewController.getRoot());

			Pane root = scenes.get("VisualisationView");
			currentScene = "VisualisationView";

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setMinHeight(600.0);
			primaryStage.setMinWidth(400.0);
			primaryStage.setTitle("Music Player");

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		Platform.exit();
		System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
