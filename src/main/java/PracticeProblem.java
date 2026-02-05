import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String a = s.nextLine();
		System.out.println(a.charAt(0));
		
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		Boolean a = s.nextBoolean();
		System.out.println(!a);
		s.nextLine();
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int a = s.nextInt();
		System.out.println(a>5);
		s.nextLine();

		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		Double a = s.nextDouble();
		System.out.println(-2 <= a && a <=2 );
		s.nextLine();
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String a = s.nextLine();
		System.out.println("Hello World". equals(a));
		
	}

	public static void q6() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int a = s.nextInt();
		System.out.print("In: ");
		int b = s.nextInt();
		System.out.println(a<=b);
	}

	public static void q7() {
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		Double a = s.nextDouble();
		System.out.print("In: ");
		Double b = s.nextDouble();
		System.out.println(a>b);
		
	}

}
