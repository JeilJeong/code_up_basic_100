// 624ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (st.hasMoreTokens()) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < n; i++) {
            if (max < nums.get(i))
                max = nums.get(i);
            if (min > nums.get(i))
                min = nums.get(i);
        }
        bw.write(String.valueOf(min) + " " + String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}