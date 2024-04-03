package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String cooper = "Cooper is such a good dog and is so talented. 10/10 cuddler and knows so many tricks!";
	String jameson = "Jameson is floppy buldoser of a dog. Burps and farts a lot but it is darn cute";
	String mackenzie = "Mackenzie rules. She is so nice and caring, we love her.";
	String ryan = "Ryan is coo. He has lots of stuff.";
	String david = "David is my boufriend and I love him and he is so cool.";

		// 2. Ask the user to enter a name. Store their answer in a variable.
	String userResp = JOptionPane.showInputDialog("Enter a name: ");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (userResp.equals("cooper")) {
		JOptionPane.showMessageDialog(null, cooper);
	}
	else if (userResp.equals("mackenzie")) {
		JOptionPane.showMessageDialog(null, mackenzie);
	}
	else if (userResp.equals("ryan")) {
		JOptionPane.showMessageDialog(null, ryan);
	}
	else if (userResp.equals("david")) {
		JOptionPane.showMessageDialog(null, david);
	}
	else{
		JOptionPane.showMessageDialog(null, "We don't know her.");
	}
	
	
	}
}

