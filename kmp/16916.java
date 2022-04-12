import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String originalStr = br.readLine();
		String patternStr = br.readLine();

		System.out.println(kmp(originalStr, patternStr));
	}

	static int[] makeTable(String pattern) {
		char[] patterns = pattern.toCharArray();
		int[] table = new int[patterns.length];
		int j = 0;

		for (int i = 1; i < patterns.length; i++) {
			while (j > 0 && patterns[i] != patterns[j]) {
				j = table[j - 1];
			}

			if (patterns[i] == patterns[j]) {
				table[i] = ++j;
			}
		}

		return table;
	}

	static int kmp(String original, String pattern) {
		int[] table = makeTable(pattern);
		char[] originals = original.toCharArray();
		char[] patterns = pattern.toCharArray();
		int j = 0, res = 0;

		for (int i = 0; i < originals.length; i++) {
			while (j > 0 && originals[i] != patterns[j]) {
				j = table[j - 1];
			}

			if (originals[i] == patterns[j]) {
				if (j == patterns.length - 1) {
					j = table[j];
					res = 1;
				} else {
					j++;
				}
			}
		}

		return res;

	}
}