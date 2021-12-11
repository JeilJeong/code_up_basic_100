// 124ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n < 100) {
            System.out.println(n);
            return;
        }
        int count = 99;
        for (int i = 100; i <= n; i++) {
            int test = i;
            int prev = 0;
            int after = 0;
            int diff = 0;
            prev = test % 10;
            test /= 10;
            after = test % 10;
            test /= 10;
            diff = prev - after;
            int diff_comp = 0;
            while (test > 0) {
                prev = after;
                after = test % 10;
                diff_comp = prev - after;
                if (diff != diff_comp)
                    break;
                test /= 10;
            }
            if (test == 0)
                count += 1;
        }
        System.out.println(count);
        br.close();
    }
}