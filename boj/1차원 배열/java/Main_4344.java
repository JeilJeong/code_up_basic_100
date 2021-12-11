// 180ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int person = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] scores = new int[person];
            for (int j = 0; j < person; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double avg = (double) sum / person;
            int count = 0;
            for (int j = 0; j < person; j++) {
                if (scores[j] > avg)
                    count += 1;
            }
            System.out.printf("%.3f%%\n", (double) count / person * 100);
        }
        br.close();
    }
}