import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	void drawsquare(Robot a) {
		for (int i = 0; i < 4; i++) {
			a.move(100);
			a.turn(90);
		}
	}

	public static void main(String[] args) {
		Robot ran = new Robot();
		ran.setSpeed(100);
		ran.hide();
		ran.penDown();
		ran.setRandomPenColor();

	}
}
