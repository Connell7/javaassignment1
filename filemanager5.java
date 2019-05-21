package Projectdraft1;

import java.io.*;
import java.util.*;

public class filemanager5{
	
	private String aches = " ";
	private Scanner x;
	
	
	public void openfile() {
		try {
			setX(new Scanner(new File("dataset2.txt")));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}		
	}
	public void readFile() {
		while(getX().hasNext()) {
		    String temp = getX().next();
			String aches = getX().next();
			String soret = getX().next();
			String tons = getX().next();
			
			
			}
	}
	
	
	public void closeFile() {
		getX().close();
	}
	public String getAches() {
		return aches;
	}
	public void setAches(String aches) {
		this.aches = aches;
	}
	public Scanner getX() {
		return x;
	}
	public void setX(Scanner x) {
		this.x = x;
	}
	
	
	
	
	
}