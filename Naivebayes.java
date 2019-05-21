package Projectdraft1;

import Projectdraft1.filemanager6;

public class Naivebayes extends filemanager6{
		
	static filemanager6 FM = new filemanager6();
	public static int hot=0;
	public static int cool=0;
	public static int normal=0;
	public static int throat=0;
	public static int aches=0;
	public static int tons=0;
	public String[] temp;
	public static String line;
	
	public static void Naive() {
		filemanager6.fm6();
		
		//System.out.println(getArrayCol(2));
		for(int i=1;i<FM.arrSize();i++)
		{
		    line = FM.getArrayCol(i);
			String line1 = line.replace("]", "").replace("[", "").toLowerCase();;
			String[] elements = line1.split("\\s+");
			
			if(elements[3].equals("yes"))//check for tonsilitis
			{
				tons++;
				if(elements[2].equals("yes"))
				{
					throat++;
				}
				if(elements[1].equals("yes"))
				{
					aches++;
				}
				if(elements[0].equals("hot"))
				{
					hot++;
				}
				if(elements[0].equals("normal"))
				{
					normal++;
				}
				if(elements[0].equals("cool"))
				{
					cool++;
					
				}
				
			}
							
		}
	}
	public int getHot() {
		return hot;
	}
	
	public int getCool() {
		return cool;
	}
	public int getNormal() {
		return normal;
	}
	
	public int getThroat() {
		return throat;
	}
	
	public int getAches() {
		return aches;
	}
	public int getTons() {
		return tons;
	}
	public static String getLine() {
		return line;
	}
	public static void setLine(String line) {
		Naivebayes.line = line;
	}
	
	
}
