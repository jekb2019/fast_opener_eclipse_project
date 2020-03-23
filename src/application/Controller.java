package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

		@FXML
		private void runCommand(ActionEvent event) {
			
		}
		@FXML
		private void openSetting(ActionEvent event) throws IOException {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("settingPage.fxml"));
		    Parent root = (Parent) fxmlLoader.load();
		    Stage stage = new Stage();
		    stage.setTitle("Setting");
		    stage.setScene(new Scene(root));  
		    stage.show();
		}
		@FXML
		private void addCommand(ActionEvent event) {
			
		}
		@FXML
		private void openView(ActionEvent event) throws IOException {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("viewPage.fxml"));
		    Parent root = (Parent) fxmlLoader.load();
		    Stage stage = new Stage();
		    stage.setTitle("Setting");
		    stage.setScene(new Scene(root));  
		    stage.show();
		}
}
