// REF : https://insight-bgh.tistory.com/336

// time : 156ms

// 함수 호출 + visited 체크 방식 이용

/*
시간 효율면에서 불리함 > r번의 combination 함수를 호출하는 방식으로
만약 m == result 일 경우 모든 task를 종료하는 것이 효율적이나
return을 하더라도 호출 스택의 모든 함수가 종료되는 것이 아니기 때문에
모든 서칭을 진행 후 result 값을 출력함
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798_v5 {
    private static int[] nums;
    private static boolean[] visited;
    private static int result;
    private static int n;
    private static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // result 초기화
        result = 0;
        combination(0, 3);
        System.out.println(result);
        br.close();
    }

    public static void combination(int start, int r) {
        if (r == 0) {
            compare();
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(i + 1, r - 1);
            visited[i] = false;
        }
    }

    public static void compare() {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i])
                sum += nums[i];
        }

        if (result < sum && sum <= m) {
            result = sum;
        }
    }
}