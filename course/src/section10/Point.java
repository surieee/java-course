package section10;

import java.util.Scanner;

public class Point {

	private int x;

	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distanceTo(Point other) {
		double d2 = Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2);
		return Math.sqrt(d2);
		// Your code here
	}

	public static void main(String[] args) {
		System.out.println("Enter the cooridnates of a point in 2D");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		Point obj1 = new Point(x1, y1);
		Point obj2 = new Point(x1, y1);
		System.out.println("Enter the displacement of point in 2D");
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		obj2.move(dx, dy);
		System.out.println("2D coordinate of first point : (" + obj1.getX() + "," + obj1.getY() + ")");

		System.out
				.println("2D coordinate of first point after displacemet : (" + obj1.getX() + "," + obj1.getY() + ")");

		System.out.println("Distance between both points is " + obj1.distanceTo(obj2));
		sc.close();
	}
}
