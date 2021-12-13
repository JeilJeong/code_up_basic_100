// 128ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int a_reverse = 0;
        int b_reverse = 0;
        while (a > 0) {
            a_reverse *= 10;
            b_reverse *= 10;
            a_reverse += a % 10;
            b_reverse += b % 10;
            a /= 10;
            b /= 10;
        }
        if (a_reverse > b_reverse)
            System.out.println(a_reverse);
        else
            System.out.println(b_reverse);
        br.close();
    }
}