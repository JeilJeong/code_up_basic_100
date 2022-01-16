// 시간복잡도에서 recursion보다 성능 향상은 없음

// ref : https://st-lab.tistory.com/94
// 배열을 이용한 방식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10870_v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] fibonacci = new int[n + 1];

        for (int i = 0; i < fibonacci.length; i++) {
            if (i == 0)
                fibonacci[i] = 0;
            else if (i == 1)
                fibonacci[i] = 1;
            else
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[n]);
        br.close();
    }
}