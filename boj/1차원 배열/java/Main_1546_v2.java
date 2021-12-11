// ref
//  https://st-lab.tistory.com/47

// 136ms > 124ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = -1;
        double sum = 0;
        int value = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            value = Integer.parseInt(st.nextToken());
            if (max < value)
                max = value;
            sum += (double) value;
        }
        System.out.println(((sum / max) * 100) / n);
        br.close();
    }
}