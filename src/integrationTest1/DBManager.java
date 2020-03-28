package integrationTest1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DBManager {

	{
		System.out.println("Working Directory = " +
				System.getProperty("user.dir"));
		initializeDB();
	}

	String getUrl(String cmd) {
		//Access DB to retrieve url with a given command
		return null;
	}
	//This method creates DB text file (if it does not exist)
	private void initializeDB() {
		File database = new File("./src/integrationTest1/data/database.txt");
		if(!database.exists()) {
			try {
				database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Put default cmd/url pairs in database.txt (google and facebook)
			Writer output;
			try {
				output = new BufferedWriter(new FileWriter("./src/integrationTest1/data/database.txt",true));
				output.append("ggl<www.google.com\n").append("fb<www.facebook.com\n");
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}  
		}

	}
	String showAllCmdUrl() {
		//Access DB to show all command/url pair
		return null;
	}
	void addNewCmdUrl(String cmd, String url) {
		//add new command/url pair to DB

	}
	void deleteCmd(String cmd) {
		//in DB, delete an existing command/url pair of the provided command
	}
	void deleteAllCmdUrl() {
		// TODO Auto-generated method stub

	}



}
