import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = 'z' - 'a' + 1;
        int[] alpha = new int[len];
        for (int i = 0; i < len; i++) {
            alpha[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (alpha[str.charAt(i) - 'a'] == -1)
                alpha[str.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < len; i++) {
            System.out.printf("%d ", alpha[i]);
        }
        br.close();
    }
}