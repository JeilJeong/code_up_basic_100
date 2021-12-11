import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[42];
        for (int i = 0; i < 10; i++) {
            count[Integer.parseInt(br.readLine()) % 42] += 1;
        }
        int result = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                result += 1;
        }
        System.out.println(result);
        br.close();
    }
}