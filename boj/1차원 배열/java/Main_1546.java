// 136ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double max = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Double> scores = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            scores.add(Double.parseDouble(st.nextToken()));
            if (max < scores.get(i))
                max = scores.get(i);
        }
        double avg = 0;
        for (int i = 0; i < n; i++) {
            scores.set(i, (scores.get(i) / max) * 100);
            avg += scores.get(i);
        }
        System.out.println((double)avg / n);
        br.close();
    }
}