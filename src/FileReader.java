import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {

	public static void main(String[] args) {
		
		// The local file is in the txt format, while the scan object is initialized.
		File fileName = new File("C:\\Users\\Alonso99\\Desktop\\test.txt");
		Scanner scan = null;
		
		// Java Exception Handler
		try {
			scan = new Scanner(fileName);
			
			// The Scanner is printing out each line of the txt file until there is no more text. 
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
