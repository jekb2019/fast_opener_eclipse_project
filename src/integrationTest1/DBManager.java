package integrationTest1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DBManager {

	File database = null;
	String dbDir = "./src/integrationTest1/data/database.txt";

	{
		initializeDB();
	}

	String getUrl(String cmd) {
		//Access DB to retrieve url with a given command
		return null;
	}
	//This method creates DB text file (if it does not exist)
	private void initializeDB() {
		this.database = new File(this.dbDir);
		if(!database.exists()) {
			try {
				database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Put default cmd/url pairs in database.txt (google and facebook)
			Writer output;
			try {
				output = new BufferedWriter(new FileWriter(this.database,true));
				output.append("ggl<www.google.com\n").append("fb<www.facebook.com");
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
		String pair = "\n"+cmd + "<" + url;

		Writer output;
		try {
			output = new BufferedWriter(new FileWriter(this.dbDir,true));
			output.append(pair);
			output.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//This method checks duplicate cmd/url pair (INCOMPLETE)
	boolean checkDuplicate(String cmd, String url) {
		if(true) {
			//if duplicate return true
			return true;
		}
		return false;
	}
	
	void deleteCmd(String cmd) {
		//in DB, delete an existing command/url pair of the provided command
	}
	void deleteAllCmdUrl() {
		// TODO Auto-generated method stub

	}



}
