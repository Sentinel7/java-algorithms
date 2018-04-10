import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class YelpClean {

	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new FileReader("C:/Users/alex/Desktop/yelp_sql"));
		BufferedWriter wd = new BufferedWriter(new FileWriter("C:/Users/alex/Desktop/yelpcleaned.sql"));
		
		String line = rd.readLine();
		while(!line.contains("MySQL dump")) {
			line = rd.readLine();
			System.out.println(line);
		}

		int i=0;
		while (line != null) {
			if(i%100 == 0)
				System.out.println(i);
			i++;

			wd.write(line);
			wd.newLine();
			
			line = rd.readLine();
		}
		
		rd.close();
		wd.close();
	}

}
