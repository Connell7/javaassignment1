package Projectdraft1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Screen extends JFrame implements ActionListener
{
	
	private JLabel label1;
	private JCheckBox aches;
	private JCheckBox throat;
	private JComboBox<?> temp;
	private JLabel ltemp;
	private JButton submit;
	String Temp[]= {"Hot","Normal","Cool"};
	Naivebayes NB = new Naivebayes();
	filemanager6 FM = new filemanager6();
	public Screen(String title)
	{
		
		   super(title);
		   this.setLayout(new FlowLayout(FlowLayout.CENTER));
		   
		   label1 = new JLabel("Enter your symptoms:");
		   aches = new JCheckBox("aches");
		   throat = new JCheckBox("Sore throat");
		   temp = new JComboBox<Object>(Temp);
		   ltemp = new JLabel("Temperature:");
		   submit = new JButton("Submit");
		   
		   this.add(label1);
		   this.add(aches);
		   this.add(throat);
		   this.add(ltemp);
		   this.add(temp);
		   this.add(submit);
		   
		   submit.addActionListener(this);
		   
		   setLocation(100,100);	  
		   setSize(200,300);
	       setVisible(true);
	       for(int i=1;i<FM.arrSize();i++){
			    NB.line = FM.getArrayCol(i);
			    
	       }
	       
	       
	      
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			int val1 = 1;
			int val2 = 1;
			int val3 = 1;
			int val4 = NB.getTons();
			if(aches.isSelected()) {
				val1 = NB.getAches();
			}
			if(throat.isSelected()){
				val2 = NB.getThroat();
			}
			if(temp.getSelectedItem() =="Hot"){
				val3 = NB.getHot();
			}
			if(temp.getSelectedItem() =="Normal"){
				val3 = NB.getNormal();
			}
			if(temp.getSelectedItem() =="Cool"){
				val3 = NB.getCool();
			}
			
			float x =(float) ((float) ((((double)val3/(double)val4)*((double)val1/(double)val4)*((double)val2)/(double)val4))/(((double)val4/(double)FM.arrSize())));
			float ans = x*100;
			new DecimalFormat("$#.00").format(ans);
			JOptionPane.showMessageDialog(this,"There is a " +ans+"% chance that you have tonsilitis" );
			
		}
		
	}	  
	
	
	
	
	
}
