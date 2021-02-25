package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Drawingrobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		rob.setSpeed(5);
		rob.penDown();
		
		String shape=JOptionPane.showInputDialog(null,"What shape do you want? (Square,Triangle, Circle?)");
		String color=JOptionPane.showInputDialog(null,"What color do you want? Green, Cyan, or Blue?");
			if(color.equalsIgnoreCase("Green"))	{
			rob.setPenColor(Color.green);
			}
			if(color.equalsIgnoreCase("Cyan")) {
				rob.setPenColor(Color.cyan);
			}
			if(color.equalsIgnoreCase("Blue")) {
				rob.setPenColor(Color.blue);
			}
		if(shape.equalsIgnoreCase("square")) {
			square();
		}
		if(shape.equalsIgnoreCase("triangle")) {
			triangle();
		}
		if(shape.equalsIgnoreCase("circle")) {
			circle();
		}
	}

	public static void square() {
		for (int pencilbuscuit = 0; pencilbuscuit < 4; pencilbuscuit++) {
			rob.move(150);
			rob.turn(90);
		}
	}
	public static void triangle() {
		for(int pencilcake = 0; pencilcake < 3; pencilcake++) {
			rob.move(120);
			rob.turn(120);
		}
	}
	public static void circle() {
		for(int pencilcookie = 0; pencilcookie < 360; pencilcookie++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
