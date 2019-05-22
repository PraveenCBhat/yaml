package sample.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class readfile {
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("/Users/praveena.c/Documents/praveenbhat/Dockerfile");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("/Users/praveena.c/Documents/praveenbhat/output.yaml", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("dockerfile copied and saved as output.yaml in local");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}