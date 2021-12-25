// 에라토스네의 체를 활용해 초기에 MAX_RANGE로 배열을 생성 후 test값의 mid 값을 찾아 계산

// 348ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9020 {
    public static boolean[] prime = null;
    public static final int MAX_RANGE = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        prime = new boolean[MAX_RANGE + 1];
        get_prime();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int test = Integer.parseInt(br.readLine());
            int mid = test / 2;
            int k = 0;
            while (true) {
                int first_operand = mid - k;
                int second_operand = 0;
                if (prime[first_operand] == false) {
                    second_operand = test - first_operand;
                    if (prime[second_operand] == false) {
                        System.out.println(first_operand + " " + second_operand);
                        break;
                    }
                }
                k++;
            }
        }
        br.close();
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i] == true)
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}