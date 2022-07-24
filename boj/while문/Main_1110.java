import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a, b, next;
        while (true) {
            a = n / 10;
            b = n % 10;
            next = (b * 10) + (a + b);
            if (next == n)
                break;

        }
        br.close();
    }
}