// V1에서는 StackOverflow가 근소한 차이로 난다. because of line 12

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = pibonach(n - 1) + pibonach(n - 2);
        System.out.println(result);
        br.close();
    }

    public static int pibonach(int n) {
        if (n == 0)
            return (0);
        else if (n == 1)
            return (1);
        return (pibonach(n - 1) + pibonach(n - 2));
    }
}