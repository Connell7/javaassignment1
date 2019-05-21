package Projectdraft1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class filemanager6 {
	
	private static List<List<String>> arr1;
	public static void fm6()  
	{
		// read file into list
	    List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("dataset1.txt"));
		} catch (IOException e) {
			System.out.println("File not found");
		  }
	    // create 2d array based on number of lines
	    arr1 = new ArrayList<>(lines.size());

	    // goes through the file line by line and splits it at whitespaces
	    lines.forEach(line -> {
	        // store it in our 2d array
	        arr1.add(Arrays.asList(line));
	    });

	    
	}
	public String getArrayCol(int x)
	{
		
		return arr1.get(x).toString();
		
		
	}
	public int arrSize()
	{
		return arr1.size();
		
	}
}
