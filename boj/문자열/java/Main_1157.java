import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = 'z' - 'a' + 1;
        int[] small = new int[len];
        int[] big = new int[len];
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                small[str.charAt(i) - 'a'] += 1;
            } else {
                big[str.charAt(i) - 'A'] += 1;
            }
        }
        // array copy
        int[] total = new int[len * 2];
        for (int i = 0; i < len; i++) {
            total[i] = small[i];
            total[len + i] = big[i];
        }
        int max_count = -1;
        int max_index = -1;
        for (int i = 0; i < len; i++) {
            if (max_count < total[i]) {
                max_count = total[i];
                total[i] = -1;
                max_index = i;
            }
        }
        for (int i = 0; i < total.length; i++) {
            if (total[i] >= max_count) {
                System.out.println("?");
                return;
            }
        }
        if (max_index >= len) {
            System.out.println((char)((int)'A' + (max_index - len)));
        } else {
            System.out.println((char)((int)'a' + max_index));
        }
        br.close();
    }
}