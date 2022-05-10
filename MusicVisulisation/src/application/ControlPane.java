package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControlPane extends VBox {
	private Button playPause;
	private Button skipVw;
	private Button skipBw;
	private Slider volumeSlider;

	public ControlPane() {
		playPause = new Button();
		skipVw = new Button();
		skipBw = new Button();

		HBox upperPane = new HBox();
		HBox lowerPane = new HBox();

		playPause.getStyleClass().addAll("control-buttons");
		skipVw.getStyleClass().addAll("control-buttons");
		skipBw.getStyleClass().addAll("control-buttons");

		playPause.setId("play-icon");
		skipVw.setId("skipVw-icon");
		skipBw.setId("skipBw-icon");

		volumeSlider.getStyleClass().addAll("volume-slider");

		upperPane.getChildren().addAll(skipBw, playPause, skipVw);
		upperPane.setAlignment(Pos.CENTER);

		upperPane.getStyleClass().add("buttons");
		upperPane.setId("btn");

		lowerPane.getChildren().addAll(volumeSlider);
		lowerPane.setAlignment(Pos.CENTER);

		upperPane.getStyleClass().add("control-pane-up");
		lowerPane.getStyleClass().add("control-pane-low");

		this.getChildren().addAll(upperPane, lowerPane);
		this.getStyleClass().add("buttons-all");

	}
}
