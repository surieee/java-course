package section10;

import java.util.Scanner;

public class RGBColor {

	private int red;
	private int green;
	private int blue;

	public RGBColor(int red, int green, int blue) {
		// write your code here
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		// write your code here
		return this.red;
	}

	public int getGreen() {
		// write your code here
		return this.green;

	}

	public int getBlue() {
		// write your code here
		return this.blue;
	}

	public void invert() {
		// write your code here
		this.red = 255 - this.red;
		this.green = 255 - this.green;
		this.blue = 255 - this.blue;
	}

	public static void main(String[] args) {
		int red, green, blue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a RGB color values");
		red = sc.nextInt();
		green = sc.nextInt();
		blue = sc.nextInt();

		RGBColor obj = new RGBColor(red, green, blue);

		System.out.printf("RBG value of input color is :(%d,%d,%d)", obj.red, obj.green, obj.blue).println();
		obj.invert();
		System.out.printf("RBG value of inverted color is :(%d,%d,%d)", obj.red, obj.green, obj.blue).println();

		sc.close();
	}
}