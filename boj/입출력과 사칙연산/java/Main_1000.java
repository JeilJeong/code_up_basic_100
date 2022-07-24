package java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // str.split()을 이용할 수도 있지만 StringTokenizer보다 성능이 낮다
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a, b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);

        br.close();
    }
}