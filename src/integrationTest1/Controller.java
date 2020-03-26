package integrationTest1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Controller {

	@FXML
	TextField cmdBox;
	
	Runner model = new Runner();
	Scene currentScene = null;
	
	//Page openers
	@FXML
	private void openMainPage(ActionEvent event) throws IOException {
		openPage(event, "MainPage");
	}
	@FXML
	private void openHelpPage(ActionEvent event) throws IOException {
		openPage(event, "HelpPage");
	}
	@FXML
	private void openSettingPage(ActionEvent event) throws IOException {
		openPage(event, "SettingPage");
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
		this.currentScene = new Scene(pageParent);
		//This line gets the Stage information
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		stage.setScene(this.currentScene);
		stage.show();
	}
	
	
	//Functions

	//MainPage
	@FXML
	private void openButtonPressed(){
		//Run the command on the text field
		//Find out the content of the text field

		String cmdBoxText = cmdBox.getText();
		/**
		 * DUMMY ALERT!!
		 */
		System.out.println("Command: "+cmdBoxText);
		

		
		//Find if the cmd exist		
		/**
		 * DUMMY ALERT!!
		 */
		System.out.println("Open pressed");
		run(cmdBoxText);
		
		

	}
	
	@FXML
	private void keyPressed(KeyEvent event) {
		switch(event.getCode()) {
		case ENTER:
			openButtonPressed();
			break;
		default:
			return;
		}		
	}
	
	private void run(String cmd) {
		model.runCmd(cmd);
	}
	
}
