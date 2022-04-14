package 알고리즘;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String star = "";
        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++){
            star += "*";
            System.out.println(star);
        }
    }    
}
