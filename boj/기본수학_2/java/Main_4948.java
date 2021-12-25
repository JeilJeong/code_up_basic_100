// time : 204 ms
// memory : 26376 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4948 {
    public static boolean[] prime = null;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            prime = new boolean[(2 * n) + 1];
            get_prime();

            int count = 0;
            for (int i = n + 1; i < prime.length; i++) {
                if (prime[i] == false)
                    count += 1;
            }
            System.out.println(count);
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