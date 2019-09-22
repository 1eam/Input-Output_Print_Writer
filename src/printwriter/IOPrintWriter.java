package printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IOPrintWriter {
	public static void main(String[] args) {
		
		String fileName = "First Java-Created File.txt";
		//filename+extention created outside of PrintWriter constructor for readability efficiency
		
		PrintWriter writer = null;
		try {
		writer = new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i < 10; i++) {
			//System.out, execute naar de terminal, die werkt dus nu niet.
			writer.println("My first Java-Created TextFile with looped text (nr) " + i);
		}
		
		writer.close();
		
	}

}
