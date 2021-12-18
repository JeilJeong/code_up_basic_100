import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixed_cost = Integer.parseInt(st.nextToken());
        int extra_cost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int profit = price - extra_cost;
        if (profit <= 0) {
            System.out.println(-1);
            return;
        }
        int count = (fixed_cost / profit) + 1;
        System.out.println(count);
        br.close();
    }
}