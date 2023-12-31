import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Circle {

	private static final int RADIUS = 10;
	private double rotation;

	public Bullet(Point center, double rotation) {
		super(center, RADIUS); // define RADIUS in Bullet class
		this.rotation = rotation;
		}


	@Override
	public void paint(Graphics brush, Color color) {
		brush.setColor(color);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);

	}

	@Override
	public void move() {
		center.x += 6 * Math.cos(Math.toRadians(rotation));
		center.y += 6 * Math.sin(Math.toRadians(rotation));
		}


	public boolean outOfBounds() {
		if (center.x > Asteroids.SCREEN_WIDTH) {
			return false;
		}
		if (center.x < 0) {
			return false;
		}
		if (center.y > Asteroids.SCREEN_HEIGHT) {
			return false;
		}
		if (center.y < 0) {
			return false;
		}
		else {
			return true;
		}
	}

	public Point getCenter() {
		return center;
	}

	
}
