import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * counting sort 알고리즘 사용
 * 1896ms 통과
 */
public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] count = new int[10001];
        int[] result = new int[n];

        int value = 0;
        for (int i = 0; i < n; i++) {
            value = Integer.parseInt(br.readLine());
            arr[i] = value;
            count[value] += 1;
        }

        // count 누적 합
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int idx = -1;
        for (int i = 0; i < n; i++) {
            idx = arr[i];
            count[idx]--;
            result[count[idx]] = idx;
        }

        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}