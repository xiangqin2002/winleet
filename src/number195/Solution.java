package number195;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
	
    public static void readFile() {
        String pathname = "file.txt"; 
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) 
        ) {
            String line;
            for(int i = 0; i < 10; i++){
                line = br.readLine();
                if(line == null)
                	break;
            	if(i != 9)
            		continue;
                System.out.println(line);
            }
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
	}

}
