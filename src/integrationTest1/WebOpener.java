package integrationTest1;

import java.net.URI;

//This class does the job of opening a website with a given URL
public class WebOpener {

	public static void openWeb(String url) {
		//open website of a provided URL	

		try {

			URI uri= new URI(url);
			java.awt.Desktop.getDesktop().browse(uri);

		} catch (Exception e) {
			e.printStackTrace();
		}


	}


}
