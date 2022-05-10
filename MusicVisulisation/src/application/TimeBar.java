package application;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class TimeBar extends VBox{

	private Label currentTime;
	private Label totalTime;
	private Slider timeSlider;
	
	public TimeBar() {
		currentTime = new Label("00:00");
		totalTime = new Label("03:14");
		timeSlider = new Slider(0, 100, 0);
		
		timeSlider.setPrefWidth(300);
		timeSlider.setBlockIncrement(0.5);
		
		currentTime.getStyleClass().add("time-labels");
		totalTime.getStyleClass().add("time-labels");
		
		
		
		this.getChildren().addAll(currentTime, timeSlider, totalTime);
		this.getStyleClass().add("time-bar");
	}
	
}
