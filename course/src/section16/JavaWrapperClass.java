package section16;

public class JavaWrapperClass {

	public static void main(String[] args) {

		Integer intval1 = new Integer(5);
		Integer intval2 = new Integer("5");

		System.out.println(intval1 == intval2);

		Integer intval3 = Integer.valueOf(13);
		Integer intval4 = Integer.valueOf("13");

		System.out.println(intval3 == intval4);

		Integer intval5 = Integer.valueOf("1101", 2);
		System.out.println(intval5);

		System.out.println(intval5 == intval4);

		Boolean b1 = new Boolean("True");
		Boolean b2 = new Boolean("True");
		Boolean b3 = Boolean.valueOf("True");
		Boolean b4 = Boolean.valueOf("True");
		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

	}

}