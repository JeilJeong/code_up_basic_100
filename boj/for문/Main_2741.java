// 280ms > c언어 12ms, 파이썬 112ms보다 느리다 > buffer를 사용할만큼 input이 큰 경우 java가 유리하지만, 그렇지 않은 경우 python이 더 유리

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++)
            bw.write(i + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}