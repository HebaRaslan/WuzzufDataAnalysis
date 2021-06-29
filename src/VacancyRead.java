import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VacancyRead {
	public static void main(String []args) {
	    try {	
		File vacancyFile= new File("filepath");
		Scanner myReader=new Scanner(vacancyFile);
		while (myReader.hasNextLine()) {
			String data=myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	    }
	    catch (FileNotFoundException e) {
	    	System.out.println("notfound");
	    	e.printStackTrace();
	    }
	}

}
