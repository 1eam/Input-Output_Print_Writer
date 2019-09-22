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
		
		for(int i = 1; i < 10; i++) {
			//System.out print naar de terminal, du die werkt niet
			writer.println("My first Java-Created TextFile with looped text (nr) " + i);
		}
		
		writer.close();
		
	}

}
