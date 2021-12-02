import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String star = "";
        for (int i = 1; i < n + 1; i++) {
            star = "";
            for (int j = 0; j < i; j++) {
                star += "*";
            }
            System.out.println(star);
        }
        br.close();
    }
}