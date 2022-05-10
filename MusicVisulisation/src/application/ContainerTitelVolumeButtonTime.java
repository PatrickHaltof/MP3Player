package application;

import javafx.scene.layout.VBox;

public class ContainerTitelVolumeButtonTime extends VBox {

	public TimeBar timeBar;
	public ContainerTitleButtonsMenu containerTitleButtonMenu;

	public ContainerTitelVolumeButtonTime() {

		timeBar = new TimeBar();
		containerTitleButtonMenu = new ContainerTitleButtonsMenu();

		this.getChildren().addAll(timeBar, containerTitleButtonMenu);

	}
}
