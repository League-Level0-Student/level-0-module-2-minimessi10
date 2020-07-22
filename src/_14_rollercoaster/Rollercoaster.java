package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {

	//int cats = Integer.parseInt(input);
public static void main(String[] args) {
	String heigth= JOptionPane.showInputDialog("who tall are you");
	int tall=Integer.parseInt(heigth);     
	if (tall>48) {
		JOptionPane.showMessageDialog(null,"go in");
	}
	if(tall>42&&tall<48) {
		JOptionPane.showMessageDialog(null,"must have a parent");
	}
	if(tall<42) {
		JOptionPane.showMessageDialog(null,"cant go on the ride");
	}
	
	
	
	
	
}
}
