import java.util.ArrayList;
import java.util.List;

public class VacancyDAO
{
    List<Vacancy> vacancylst;
    String path;
    public VacancyDAO(String path) {
        vacancylst=new ArrayList<>();
        List<String>lines = new ArrayList<String>();
		try {
			lines=Files.readAllLines(pyramidFile.toPath());
		}catch(Exception e) {
			System.out.println("file not found");
		}
		
        this.path=path;
    }
    public boolean Read()
    {
        for(int i=1;i<lines.size();i++) {
			String line=lines.get(i);
			String []fields=line.split(",");
			 for (int i1 =0;i1<fields.length; i1++) {
				 fields[i1]=fields[i1].trim();
				
			}
			 Vacancy v = new Vacancy (fields[0],fields[1],fields[2],fields[3],fields[4],Integer.parseInteger(fields[5]),fields[6],field[7]?how to add here list?);
			 vacancylst.add(v);
		}
        //TODO:Parser the CSV File and fillling of the data
     return true;
    }

}
