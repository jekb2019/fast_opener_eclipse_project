package dummy3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private void openMainPage(ActionEvent event) throws IOException {
		openPage(event, "MainPage");
		System.out.println("main");
	}
	@FXML
	private void openHelpPage(ActionEvent event) throws IOException {
		openPage(event, "HelpPage");
		System.out.println("help");
	}
	@FXML
	private void openSettingPage(ActionEvent event) throws IOException {
		openPage(event, "SettingPage");
		System.out.println("setting");
	}
	@FXML
	private void openViewExistingCmdPage(ActionEvent event) throws IOException {
		openPage(event, "ViewExistingCmdPage");
	}
	@FXML
	private void openAddNewCmdPage(ActionEvent event) throws IOException {
		openPage(event, "AddNewCmdPage");
	}

	private void openPage(ActionEvent event, String fxmlName) throws IOException{
		Parent pageParent = FXMLLoader.load(getClass().getResource("fxml/"+fxmlName+".fxml"));
		Scene pageScene = new Scene(pageParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(pageScene);
		stage.show();
	}
	
	
	
	
}
