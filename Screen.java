package Projectdraft1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen extends JFrame implements ActionListener
{
	
	private JLabel label1;
	private JCheckBox aches;
	private JCheckBox throat;
	private JComboBox<?> temp;
	private JLabel ltemp;
	String Temp[]= {"Hot","Normal","Cold"};
	
	public Screen(String title)
	{
		
		   super(title);
		   this.setLayout(new FlowLayout(FlowLayout.CENTER));
		   
		   label1 = new JLabel("Enter your symptoms:");
		   aches = new JCheckBox("aches");
		   throat = new JCheckBox("Sore throat");
		   temp = new JComboBox<Object>(Temp);
		   ltemp = new JLabel("Temperature:");
		   
		   this.add(label1);
		   this.add(aches);
		   this.add(throat);
		   this.add(ltemp);
		   this.add(temp);
		   
		   
		   setLocation(100,100);	  
		   setSize(200,300);
	       setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	  
	
	
	
	
	
}
