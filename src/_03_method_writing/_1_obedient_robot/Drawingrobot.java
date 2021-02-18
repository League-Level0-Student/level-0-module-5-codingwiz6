package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Drawingrobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		rob.setSpeed(5);
		rob.penDown();

	}

	public static void square() {
		for (int pencil = 0; pencil < 5; pencil++) {
			rob.move(150);
			rob.turn(90);
		}
	}
}
