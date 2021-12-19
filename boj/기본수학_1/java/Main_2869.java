import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int over_night = a - b;
        int remain = v % over_night;
        int day = 0;
        if (remain == 0) {
            day = ((v - a) / over_night) + 1;
        } else {
            day = (v / over_night) + 1;
        }
        System.out.println(day);
        br.close();
    }
}