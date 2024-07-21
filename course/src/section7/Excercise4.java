package section7;

public class Excercise4 {

	public boolean isPass(int marks) {
		if (marks < 51) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Excercise4 s1 = new Excercise4();
		Excercise4 s2 = new Excercise4();
		System.out.println("Student with 52 marks is " + (s1.isPass(55) ? "PASS" : "FAIL"));
		System.out.println("Student with 33 marks is " + (s2.isPass(33) ? "PASS" : "FAIL"));
	}
}
