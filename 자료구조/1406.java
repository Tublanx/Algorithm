import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		LinkedList<Character> linkedList = new LinkedList<>();

		for (int i = 0; i < str.length(); i++) {
			linkedList.add(str.charAt(i));
		}

		ListIterator<Character> listIterator = linkedList.listIterator();

		while (listIterator.hasNext()) {
			listIterator.next();
		}

		for (int i = 0; i < N; i++) {
			String comm = br.readLine();
			char first = comm.charAt(0);

			if (first == 'P') {
				listIterator.add(comm.charAt(2));
			} else if (first == 'L') {
				if (listIterator.hasPrevious()) {
					listIterator.previous();
				}
			} else if (first == 'D') {
				if (listIterator.hasNext()) {
					listIterator.next();
				}
			} else if (first == 'B') {
				if (listIterator.hasPrevious()) {
					listIterator.previous();
					listIterator.remove();
				}
			}
		}

		for (var c : linkedList) {
			bw.write(c);
		}

		bw.flush();
	}

}
