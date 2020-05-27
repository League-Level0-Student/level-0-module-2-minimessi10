package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteria {
public static void main(String[] args) {
	Random randomMaker = new Random();
	int randomNumber=randomMaker.nextInt(4);
	int randomNumber2=randomMaker.nextInt(80);
	int randomNumber3=randomMaker.nextInt(40);
	int randomNumber4=randomMaker.nextInt(20);
	int randomNumber5=randomMaker.nextInt(400);
	int randomNumber6=randomMaker.nextInt(30);
	String message= randomNumber + " " + randomNumber2 + " "+ randomNumber3 +  " " +randomNumber4 + " " + randomNumber5 + " " + randomNumber6;
	JOptionPane.showMessageDialog(null, message);
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
