package GUI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GUIStartController {

	@FXML
	private Button new_findings_bill;

	public void new_bill() {
		try {
			FXMLLoader loader = new FXMLLoader(StartMain.class.getResource("BillWindow.fxml"));
			Parent root1 = (Parent) loader.load();
			Stage stage = new Stage();
			stage.setTitle("Neuen Befundschein anlegen");
			stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
			Scene scene = new Scene(root1);
			scene.getStylesheets().add(this.getClass().getResource("billWindow.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			System.out.println("GUI could not be loaded");
			e.printStackTrace();
		}
	}
}
