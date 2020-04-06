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

	//MainPage Fields
	@FXML
	TextField cmdBox;
	
	//AddNewCmdPage Fields
	@FXML
	TextField newCmdBox;
	@FXML
	TextField newUrlBox;
	
	
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
		//update existing commands
		showExistingCmd();
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
		run(cmdBoxText);	

	}
	
	@FXML
	private void main_keyPressed(KeyEvent event) {
		switch(event.getCode()) {
		case ENTER:
			openButtonPressed();
			break;
		default:
			return;
		}		
	}
	
	
	private void run(String cmd) {
		if(!model.runCmd(cmd)) {
			
		}
	}
	
	//AddNewCmdPage
	@FXML
	private void saveNewCmdUrl(ActionEvent event) {
		if(this.newCmdBox.getText().equals("") ||this.newUrlBox.getText().equals("")) {
			return;
		}
		System.out.println("text: "+this.newCmdBox.getText());
		model.addNewCmdUrl(this.newCmdBox.getText(), this.newUrlBox.getText());
	}
	

	//ViewExistingCmdPage
	private void showExistingCmd() {
		
	}
	
	
}
