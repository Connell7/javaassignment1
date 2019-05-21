package Projectdraft1;

import java.io.FileNotFoundException;

public class Control {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		Naivebayes NB = new Naivebayes();
		NB.Naive();
		new filemanager6();
		filemanager6.fm6();
		new Screen("Tonsilitis checker");
	
		
		
	}

}
