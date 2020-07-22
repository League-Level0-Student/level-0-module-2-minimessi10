package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String vote=JOptionPane.showInputDialog("how old are you");
	int voting=Integer.parseInt(vote); 
	if (voting>18) {
		JOptionPane.showMessageDialog(null,"vote");
	}
	if (voting<18) {
		JOptionPane.showMessageDialog(null,"dont vote no one cares");
	}
}
}
