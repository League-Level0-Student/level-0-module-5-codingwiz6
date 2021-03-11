package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes=JOptionPane.showInputDialog("How many dimes do you have?");



// Tell them how many cents they have (hint multiply by 10)
	int cents =Integer.parseInt(dimes);
cents=cents*10;		
 
 JOptionPane.showMessageDialog(null, "You have " +cents+ " cents.");




// Ask the user how tall they are (inches)
String tallshort=JOptionPane.showInputDialog(null, "How tall are you?");

int tall =Integer.parseInt(tallshort);


// If they are shorter than 36 inches, tell them to eat their Wheaties
if(tall<36){
JOptionPane.showMessageDialog(null, "Hey, I know how to get taller....Eat more Wheaties!!!");
}

}




void skill2() { // Write a loop to print every third number between 1 and 30 to the console

for(int number=3;number<33;number++) {
	if(number % 3==0) {
		System.out.println(number);
	}
}





}

void skill3() { // Get a random number that is less than 20 and print it to the console
	
	Random randy = new Random();
	int randNum = randy.nextInt(21-10+1)+10; 
	
	//int eq = randy.nextInt(big-small+1)+small
	//int x = randy.nextInt(26)+10; //0-10  10-35
	//int y = randy.nextInt(75-25+1)+25; //25-75

// Get another random number that is less than 10 and print it to the console
int randNum2=randy.nextInt(11);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
int randtotalNum= randNum-randNum2;
JOptionPane.showMessageDialog(null, "The difference of the numbers was"+ randtotalNum+ ".");

}

void skill4() { // In a pop-up, ask the user for the city they live in

String city= JOptionPane.showInputDialog("What city do you live in?"); 

// If they answered "San Diego", tell them they live in America's Finest City
if(city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city!");
}


// Otherwise, tell them to move to San Diego
else if {
	JOptionPane.showMessageDialog(null,"You should move to San Diego,");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."



// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



}

void skill5() { // In a pop-up, ask the user for the name of their school



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}
