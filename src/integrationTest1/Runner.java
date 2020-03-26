package integrationTest1;

//This class represents Model of the MVC
public class Runner {
	
	//DBManager instance
	DBManager dbManager = new DBManager();
	
	
	//To WebOpener
	
	/** 
	 * User types in a specific command(that is already in the DB) and press "Go" button to open the website
	 */
	void runCmd(String cmd) {
		//with provided cmd, open the website
	
		//Find corresponding Url
		String url = getUrl(cmd);
		
		/**
		 * DUMMY ALERT! 그냥 google.com으로 해보자!
		 */
		url = "www.google.com";

		
		//Open website using webOpener
		WebOpener.openWeb(url);

	}
	
	
	//To DBManager

	/**
	 * Get URL of a cmd
	 */
	String getUrl(String cmd) {
		return dbManager.getUrl(cmd);
	}
	
	/** 
	 * User wants to see all the list of existing command/url pairs
	 */
	void showAllCmdUrl() {
		//show all cmd/url pairs in DB
		dbManager.showAllCmdUrl();
	}
	/** 
	 * User adds a new command/url pair
	 */
	void addNewCmdUrl(String cmd, String url) {
		//add new cmd/url pair to DB
		dbManager.addNewCmdUrl(cmd, url);
	}
	/** 
	 * User deletes an existing command/url pair
	 */
	void deleteCmdUrl(String cmd) {
		//with provided cmd, delete a cmd/url pair in DB
		dbManager.deleteCmd(cmd);
	}
	void deleteAllCmdUrl() {
		//delete All cmd url
		dbManager.deleteAllCmdUrl();
	}
	

}
