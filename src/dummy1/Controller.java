package dummy1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
	
	
	@FXML
	private Button goButton;
	
	//MAIN PAGE
	@FXML
	private void help(ActionEvent event) throws IOException {
		//Change scene to help page
		Parent helpParent = FXMLLoader.load(getClass().getResource("HelpPage.fxml"));
		Scene helpScene = new Scene(helpParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(helpScene);
		stage.show();
	}
	@FXML
	private void setting(ActionEvent event) throws IOException {
		//Change scene to setting page
		Parent settingParent = FXMLLoader.load(getClass().getResource("SettingPage.fxml"));
		Scene settingScene = new Scene(settingParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(settingScene);
		stage.show();
	}
	@FXML
	private void mainMenu(ActionEvent event) throws IOException{
		Parent mainParent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		Scene mainScene = new Scene(mainParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(mainScene);
		stage.show();
	}
	@FXML
	private void addNewCommand(ActionEvent event) throws IOException{
		Parent addNewParent = FXMLLoader.load(getClass().getResource("AddNewCmdPage.fxml"));
		Scene addNewScene = new Scene(addNewParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(addNewScene);
		stage.show();
	}
	@FXML
	private void viewCmd(ActionEvent event) throws IOException{
		Parent viewCmdParent = FXMLLoader.load(getClass().getResource("ViewCmdPage.fxml"));
		Scene viewCmdScene = new Scene(viewCmdParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(viewCmdScene);
		stage.show();
	}
	@FXML
	private void displaySetting(ActionEvent event) throws IOException{
		Parent displayParent = FXMLLoader.load(getClass().getResource("DisplaySettingPage.fxml"));
		Scene displayScene = new Scene(displayParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(displayScene);
		stage.show();
	}
}
