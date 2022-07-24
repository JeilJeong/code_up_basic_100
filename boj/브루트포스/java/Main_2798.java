// ref > https://insight-bgh.tistory.com/336
// 재귀 백트래킹 구현 참조

/*
1. 주어진 카드에서 m과 가장 가까운 값을 골라낸다.
2. 세 장의 카드의 조합을 계산한다.
3. 5C3 = 543/321 > maximum : 100 * 99 * 98 / 6
4. 161,700번의 연산 수행 > 1, 2, 3, 더하고 > m과 비교 연산 수행 > 기존 closest와 비교 연산 > 한 차례에 4번씩 수행
5. 646,800번의 연산을 수행 > 접근 연산까지 고려했을 때 1,293,600
> MAXIMUM 연산을 수행하더라도 1초 이내 문제 풀이 가능
*/

// 결과 : fail

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798 {
    private static int[] nums;
    private static boolean[] visited;
    private static int result;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1) 첫 번째 입력 라인을 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 2) 두 번째 라인으로 들어오는 숫자를 담기 위한 배열 선언과 할당
        nums = new int[n];
        visited = new boolean[n];

        // 3) 두 번째 라인으로 들어오는 숫자를 배열 nums에 삽입
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 4) 세 장의 카드 합을 도출
        result = 100001;
        combination(0, n, 3);

        System.out.println(result);
        br.close();
    }

    public static void combination(int start, int n, int r) {
        if (r == 0) {
            compare(n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public static void compare(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                count++;
                sum += nums[i];
                if (count == 3)
                    break;
            }
        }
        int d1 = abs(m - result);
        int d2 = abs(m - sum);
        result = d1 > d2 ? sum : result;
    }

    public static int abs(int n) {
        if (n >= 0)
            return n;
        else
            return n * -1;
    }
}