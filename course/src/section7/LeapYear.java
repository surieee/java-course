package section7;

import java.util.Scanner;

public class LeapYear {

	public boolean isLeapYear(int year) {
		if (year < 1) {
			return false;
		}
		if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		LeapYear obj = new LeapYear();
		boolean result = obj.isLeapYear(year);
		System.out.printf("%d is %s year", year, (result ? "a leap" : "not a leap"));
		sc.close();

	}
}
