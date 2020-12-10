package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {

		String christmas = JOptionPane.showInputDialog("Please type in a number");
		int xmas = Integer.parseInt(christmas);

		for (int tree = 2; tree < xmas; tree++) {
			if (xmas % tree == 0) {
				JOptionPane.showMessageDialog(null, "This number is not prime");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "This number is prime");

	}
}
