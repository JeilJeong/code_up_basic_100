// sqrt: 2개의 인수 곱셈으로 나타낼 수 있는 배수는 한 개의 인수가 sqrt값 이내에 있는 소수 중 하나이다.
// 에라토스네의 체를 사용한 방법 : 에라토스네의 체의 시간복잡도에 대한 알고리즘

// ref
//  https://st-lab.tistory.com/84
//  https://st-lab.tistory.com/81

// 220ms : 확실히 n값이 커질수록 에라토스네의 체가 월등히 빠른 속도를 보여줌

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1929_v3 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n + 1];
        get_prime();

        StringBuilder sb = new StringBuilder();

        for (int i = m; i <= n; i++) {
            if (!prime[i])
                sb.append(i).append('\n');
        }
        System.out.println(sb);
        br.close();
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}