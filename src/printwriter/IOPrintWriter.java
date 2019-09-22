package printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOPrintWriter {
	public static void main(String[] args) {
		
		String fileName = "First Java-Created File.txt";
		
		PrintWriter writer = null;
		try {
		writer = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
