// 120ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int result = 0;
        int chr = 0;
        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            if (chr >= 'A' && chr <= 'C') {
                result += 3;
            } else if (chr >= 'D' && chr <= 'F') {
                result += 4;
            } else if (chr >= 'G' && chr <= 'I') {
                result += 5;
            } else if (chr >= 'J' && chr <= 'L') {
                result += 6;
            } else if (chr >= 'M' && chr <= 'O') {
                result += 7;
            } else if (chr >= 'P' && chr <= 'S') {
                result += 8;
            } else if (chr >= 'T' && chr <= 'V') {
                result += 9;
            } else if (chr >= 'W' && chr <= 'Z') {
                result += 10;
            }
        }
        System.out.println(result);
        br.close();
    }
}