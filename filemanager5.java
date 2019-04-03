package Projectdraft1;

import java.io.*;
import java.util.*;

public class filemanager5{
	
	private String aches = "";
	private Scanner x;
	public void openfile() {
		try {
			x = new Scanner(new File("dataset1.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}		
	}
	public void readFile() {
		while(x.hasNext()) {
		    String temp = x.next();
			String aches = x.next();
			String soret = x.next();
			String tons = x.next();
			System.out.printf("%s\n",temp);
			
		}
	}
	
	public void closeFile() {
		x.close();
	}
	public String getAches() {
		return aches;
	}
	public void setAches(String aches) {
		this.aches = aches;
	}
	
	
	
	
}