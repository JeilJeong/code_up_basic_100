import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int test = nums[i];
            int j = 2;
            for (; j < test; j++) {
                if (test % j == 0) {
                    break;
                }
            }
            if (j == test)
                count += 1;
        }

        System.out.println(count);
        br.close();
    }
}