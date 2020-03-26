package backend2;

//This class represents Model of the MVC
public class Runner {
	
	//DBManager instance
	DBManager dbManager = new DBManager();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a DBManager and a web Opener

	}

	
	
	//To WebOpener
	
	/** 
	 * User types in a specific command(that is already in the DB) and press "Go" button to open the website
	 */
	void runCmd(String cmd) {
		//with provided cmd, open the website
	
		//Find corresponding Url
		String url = getUrl(cmd);
		//Open website using webOpener
		WebOpener.openWeb(cmd);
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
	
	

}
