import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class test1 extends GraphicsProgram {

	private static final long serialVersionUID = 1L;

	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		for (int i = 0; i <= BRICKS_IN_BASE; i++) {
		printBrickRow();
		calculateAdjustments();
		}
	}

	private void printBrickRow() {
		// Print a row of bricks
		for (int i = 1; i < z; i++) {
			GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			add(brick, (x + (i * BRICK_WIDTH)), y);
		}
	}
	
	private void calculateAdjustments() {
		x = x + BRICK_WIDTH / 2;
		y -= BRICK_HEIGHT;
		z--;
	}

	private int x = 300;
	private int y = 300;
	private int z = BRICKS_IN_BASE;
}