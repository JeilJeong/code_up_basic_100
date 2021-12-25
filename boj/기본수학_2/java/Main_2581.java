// 기존 파이썬 652ms > 자바 156ms로 4배 정도의 성능 향상 기대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i) {
                sum += i;
                if (min == 0)
                    min = i;
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        br.close();
    }
}