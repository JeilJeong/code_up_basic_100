import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result_h, result_m;

        if (m - 45 < 0) {
            result_m = m - 45 + 60;
            if (h != 0)
                result_h = h - 1;
            else
                result_h = 23;
        }
        else {
            result_m = m - 45;
            result_h = h;
        }
        System.out.println(result_h + " " + result_m);
        br.close();
    }
}