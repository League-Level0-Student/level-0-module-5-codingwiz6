package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String glitter=JOptionPane.showInputDialog("Please enter your name.");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(glitter.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		for(int bomb=0; bomb<glitter.length();bomb++) {
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
			char music=glitter.charAt(1);
				
				// 5. Use % to tell what letter is even or odd 
			//bomb ohhhh ok  soo my question is what variable goes in the blank
			if(bomb % 2==0) {
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
				
			//For Next Time!! How to make a even letter uppercase
				// 7. ADD the char to the end of the goofyName String

		}
		// 8. Use pop-up to show user their Goofy name

	}
}

