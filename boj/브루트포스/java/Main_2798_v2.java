// REF > https://st-lab.tistory.com/97

// time : 128ms

// 3중 for문을 이용한 구현 + 함수 분리하지 않음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798_v2 {
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

        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = nums[i] + nums[j] + nums[k];

                    if (m == tmp) {
                        System.out.println(tmp);
                        br.close();
                        return;
                    }

                    if (result < tmp && tmp < m) {
                        result = tmp;
                    }
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}