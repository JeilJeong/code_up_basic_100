import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mul = 1;
        for (int i = 0; i < 3; i++) {
            mul *= Integer.parseInt(br.readLine());
        }
        int[] count = new int[10];
        while (mul > 0) {
            count[(mul % 10)] += 1;
            mul /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
        br.close();
    }
}