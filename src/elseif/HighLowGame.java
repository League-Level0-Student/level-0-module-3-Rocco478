//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 11; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String a=JOptionPane.showInputDialog("Guess my number");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int b=Integer.parseInt(a);
			// 5. if the guess is correct
				// 6. win
			if(b==random) {
				JOptionPane.showMessageDialog(null,"win");
			}
			// 7. if the guess is high
			if(b>random) {
				JOptionPane.showMessageDialog(null, "To high");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			if(b<random) {
				JOptionPane.showMessageDialog(null, "To low");
				// 10. tell them it's too low
			}
		// 12. tell them they lose
	}
JOptionPane.showMessageDialog(null, "you lose");
}
}

