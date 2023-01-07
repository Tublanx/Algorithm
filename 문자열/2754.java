import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	static HashMap<String, Double> gradeMap = new HashMap<>();

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		setGradeMap();

		try {
			String grade = input.readLine();
			output.write(gradeMap.get(grade).toString());

			input.close();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void setGradeMap() {
		gradeMap.put("A+", 4.3);
		gradeMap.put("A0", 4.0);
		gradeMap.put("A-", 3.7);
		gradeMap.put("B+", 3.3);
		gradeMap.put("B0", 3.0);
		gradeMap.put("B-", 2.7);
		gradeMap.put("C+", 2.3);
		gradeMap.put("C0", 2.0);
		gradeMap.put("C-", 1.7);
		gradeMap.put("D+", 1.3);
		gradeMap.put("D0", 1.0);
		gradeMap.put("D-", 0.7);
		gradeMap.put("F", 0.0);
	}
}
