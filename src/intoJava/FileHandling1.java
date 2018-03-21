import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling1 {

	public static void main(String[] args) {
		
		
		
		try {
			
			File file = new File("FileWriter.txt");
			
			FileWriter fw = new FileWriter(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
