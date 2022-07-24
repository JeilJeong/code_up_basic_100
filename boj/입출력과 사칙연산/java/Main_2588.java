package java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int len = b.length();
        for (int i = 0; i < len; i++) {
            int n = Character.getNumericValue(b.charAt(len - i - 1));
            System.out.println(a * n);
        }
        System.out.println(a * Integer.parseInt(b));
        br.close();
    }
}