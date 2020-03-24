package backend;

//This class represents Model of the MVC
public class Runner {

	//Web opener instance
	WebOpener webOpener = null;
	
	//DBManager instance
	DBManager dbManager = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a DBManager and a web Opener

	}
	
	
//	static void createNewDBManagerAndWebOpener() {
//		this.dbManager = new DBManager();
//		createNewWebOpener();
//	}
//	void createNewWebOpener() {
//		this.webOpener = new WebOpener(this.dbManager);
//	}
	
	
	
	//To WebOpener
	
	
	/** 
	 * User types in a specific command(that is already in the DB) and press "Go" button to open the website
	 */
	void runCmd(String cmd) {
		//with provided cmd, open the website
		//run command through Web Opener
		webOpener.runCmd(cmd);
	}
	
	
	//To DBManager
	

	/** 
	 * User wants to see all the list of existing command/url pairs
	 */
	void showExistingCmdUrl() {
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
