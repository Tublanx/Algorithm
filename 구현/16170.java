import java.time.LocalDate;
import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(LocalDate.now().getYear());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getDayOfMonth());
	}
}
