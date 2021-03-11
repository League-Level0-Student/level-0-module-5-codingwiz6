package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int job = 0; job < 4; job++) {
			int task = JOptionPane.showOptionDialog(null, "", "What to do with your  " + pet + "?", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Groom", "Cuddle", "Take a walk", "Clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				feed();
			}
			if (task == 1) {
				water();
			}
			if (task == 2) {
				groom();
			}
			if (task == 3) {
				cuddle();
			}
			if (task == 4) {
				walk();
			}
			if (task == 5) {
				poop();
			}
			if (happinessLevel == 4) {
				JOptionPane.showMessageDialog(null, "Looks like your pet is satisfied forever. :3");
				return;

			}

		}
	}

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public static void feed() {
		JOptionPane.showMessageDialog(null, "Your" + pet + "looks satisfied!");
		happinessLevel++;
	}

	public static void water() {
		JOptionPane.showMessageDialog(null, "Your pet is happy! :3");
		happinessLevel++;
	}

	public static void groom() {
		JOptionPane.showMessageDialog(null, " It looks super happy!");
		happinessLevel++;
	}

	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "It looks so adorable when it is happy!");
		happinessLevel++;
	}

	public static void walk() {
		JOptionPane.showMessageDialog(null, "It is really excited!");
		happinessLevel++;
	}

	public static void poop() {
		JOptionPane.showMessageDialog(null, "I know it is gross...but you did it in love, buddy. In love...");
		happinessLevel++;
	}
}