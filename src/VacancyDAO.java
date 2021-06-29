import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.Files;

public class VacancyDAO
{
        File vacancyFile= new File("file path");
		List<String>lines = new ArrayList<String>();
		try {
			lines=Files.readAllLines(vacancyFile.toPath());
		}catch(Exception e) {
			System.out.println("file not found");
		}
		for(int i=1;i<lines.size();i++) {
			String line=lines.get(i);
			String []fields=line.split(",");
			 for (int i1 =0;i1<fields.length; i1++) {
				 fields[i1]=fields[i1].trim();
				
			}
			 Vacancy v = new vacancy(fields[0],fields[1],fields[2],fields[3],field[4],Integer.parseInteger(fields[5]),fields[6],fields for list );
			 vacancylst.add(v);
    
    List<Vacancy> vacancylst;
    String path;
    public VacancyDAO(String path) {
        vacancylst=new ArrayList<>();
        this.path=path;
    }
    public boolean Read()
    {
        //TODO:Parser the CSV File and fillling of the data
     return true;
    }

}
