// timeout

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1929_v1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i < n; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i)
                System.out.println(i);
        }
        br.close();
    }
}