package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력
		// 수의 개수 (항상 홀수임)
		int N = Integer.parseInt(input.readLine());
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			// 계산할 숫자들 입력
			numbers[i] = Integer.parseInt(input.readLine());
		}
		input.close();

		// 계산
		int mean = 0;
		int median = 0;
		int mode = 0;
		int range = 0;

		mean = (int) Math.round((double) Arrays.stream(numbers).sum() / N);
		median = N == 1 ? numbers[0] : Arrays.stream(numbers).sorted().toArray()[N / 2];

		if (N == 1) {
			mode = numbers[0];
		} else {
			Map<Integer, Integer> modeMap = new HashMap<>();
			List<Integer> modeList = new ArrayList<>();

			for (var num : numbers) {
				modeMap.put(num, modeMap.getOrDefault(num, 0) + 1);
			}
			
			int modeMaxNum = 0;
			for (var v : modeMap.values()) {
				modeMaxNum = Math.max(modeMaxNum, v);
			}

			for (var k : modeMap.keySet()) {
				if (modeMap.get(k) == modeMaxNum) {
					modeList.add(k);
				}
			}

			Collections.sort(modeList);
			
			if(modeList.size() == 1) {
				mode = modeList.get(0);
			} else {
				mode = modeList.get(1);
			}
		}

		int min = Arrays.stream(numbers).boxed().min(Integer::compare).get();
		int max = Arrays.stream(numbers).boxed().max(Integer::compare).get();

		range = max - min;

		// 출력
		output.write(mean + "\n");
		output.write(median + "\n");
		output.write(mode + "\n");
		output.write(range + "");
		output.flush();
		output.close();
	}
}
