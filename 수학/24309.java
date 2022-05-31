import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		var a = sc.nextBigInteger();
		var b = sc.nextBigInteger();
		var c = sc.nextBigInteger();
		var x = (b.subtract(c)).divide(a);
		
		System.out.println(x);
	}

}
