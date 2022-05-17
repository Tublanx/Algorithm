package com.company;

import java.io.*;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String weeks[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = y;
        for (int i = 0; i < x - 1; i++) {
            sum += days[i];
        }

        bw.write(weeks[sum % 7]);
        bw.flush();
    }
}
