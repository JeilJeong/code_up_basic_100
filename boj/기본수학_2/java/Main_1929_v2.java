// sqrt만으로 풀어보려고 했으나 틀림, 이유는 모르겠음
//  17번 line에서 i < n에서 i <= n으로 변경 후 문제 없이 풀이 진행함

// 1228ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1929_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            int j = 2;
            boolean error = false;
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    error = true;
                    break;
                }
            }
            if (!error && i != 1)
                System.out.println(i);
        }
        br.close();
    }
}