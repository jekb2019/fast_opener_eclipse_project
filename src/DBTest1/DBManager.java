package DBTest1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class DBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		readAllText("Database.txt");
		addCmdUrl("cv","canvas.com");

		removeEmptyLine("Database.txt");
	}

	//Given a line in a text file, identify command
	private static void checkCmd(String line) {
		//check if the line's command field is the same as command provided
		int index = line.indexOf('<');
		String cmd = line.substring(0, index);
		System.out.println("Command: " + cmd);
		
	}
	//Given a line in a text file, identify url
	private static void checkUrl(String line) {
		int index = line.indexOf('<');
		String url = line.substring(index);
		System.out.println("Command: " + url);
	}
	
	

	//Read all cmd/urls in the text file
	private static void readAllText(String txtFile) {
		try {

			File file = new File("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\" + txtFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			
			while((line = br.readLine())!=null) {
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Add new cmd/url line to text file
	private static void addCmdUrl(String cmd, String url) {
		String pair = "\n"+cmd + "<" + url;
		
		Writer output;
		try {
			output = new BufferedWriter(new FileWriter("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\Database.txt",true));
			output.append(pair);
			output.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//remove all emtpy lines in a file. This will be used for adjusting text file.
	private static void removeEmptyLine(String fileName) {
		Scanner file;
		PrintWriter writer;
		
		try {
			File f = new File("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\" + fileName);
			file = new Scanner(f);
			writer = new PrintWriter("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\corrected.txt");
		
			while (file.hasNext()) {
                String line = file.nextLine();
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.write("\n");
                }
            }
			file.close();
            writer.close();
            //delete existing file
            f.delete();
            //change from corrected.txt --> Database.txt
            File oldFile = new File("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\corrected.txt");
            File newFile = new File("C:\\Users\\jason\\Desktop\\My Programming\\Portfolio\\fast_opener_eclipse_project\\Fast_opener\\src\\DBTest1\\Database.txt");
            oldFile.renameTo(newFile);
    
		}catch(Exception e) {
			
		}
	}
	//Remove duplicate lines
	private static void removeDuplicateLines(String fileName) {
		
	}
	//Check duplicate cmd
	private static void checkDuplicateCmd(String cmd) {
		
	}
	//change url of a cmd
	private static void changeUrl(String cmd){
			
	}
	
	
}
