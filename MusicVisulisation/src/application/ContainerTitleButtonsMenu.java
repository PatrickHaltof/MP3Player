package application;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ContainerTitleButtonsMenu extends HBox{
	private ArtistTitleView artistTitleView;
	private ControlPane controlPane;
	private Button menu;
	
	public ContainerTitleButtonsMenu() {
		artistTitleView = new ArtistTitleView();
		controlPane = new ControlPane();
		menu = new Button();
		
		menu.setId("menu-button-icon");
		menu.getStyleClass().addAll("control-buttons");
		
		this.getChildren().addAll(artistTitleView, controlPane, menu);
	}

}
