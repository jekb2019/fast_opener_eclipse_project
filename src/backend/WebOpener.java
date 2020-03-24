package backend;

public class WebOpener {

	WebOpener(DBManager dbManager){
		this.dbManager = dbManager;
	}
	
	DBManager dbManager;
	
	void runCmd(String cmd) {
		//find matching url
		String url = searchUrl(cmd);
		//open the website of the retrieved URL
		openWeb(url);
	}
	
	void openWeb(String url) {
	//open website of a provided URL	
		
	}
	
	String searchUrl(String cmd) {
	//find matching url from DB and return it
	//Ask DBManager for a corresponding URL with a given command
		return null;
	}
}
