// REF > https://st-lab.tistory.com/97

// time : 128ms

// 3중 for문 + 함수 분리 + 백트래킹
// 백트래킹은 가능성이 없을 경우 더 이상 연산/탐색을 진행하지 않음
// 여기서 주어진 카드의 수가 클수록 백트래킹을 위한 비교 연산보다 더 좋은 효율성이 나옴(현재는 128ms로 동일함)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798_v4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int result = combination(nums, n, m);

        System.out.println(result);
        br.close();
    }

    public static int combination(int[] nums, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {

            // 첫 번째 카드가 m보다 크면 skip
            if (nums[i] > m) continue;

            for (int j = i + 1; j < n - 1; j++) {

                // 두 번째 카드와 첫 번째 카드의 합이 m보다 크면 skip
                if (nums[i] + nums[j] > m) continue;

                for (int k = j + 1; k < n; k++) {
                    int tmp = nums[i] + nums[j] + nums[k];

                    if (tmp == m) {
                        return tmp;
                    }

                    if (result < tmp && tmp < m) {
                        result = tmp;
                    }
                }
            }
        }

        return result;
    }
}