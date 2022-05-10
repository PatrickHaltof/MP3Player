package application;


import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ArtistTitleView extends VBox{
	
	private Label artist;
	private Label title;
	
	public ArtistTitleView() {
		title = new Label("Title");
		title.getStyleClass().add("title-text");
		artist = new Label("Artist");
		artist.getStyleClass().add("artist-text");
		
		this.getChildren().addAll(title, artist);
		
		
	}

}
