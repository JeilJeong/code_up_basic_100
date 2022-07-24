// ref : https://st-lab.tistory.com/101

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        // 8 이상 n, m의 경우 이동 가능한 시작 지점 limit
        int n_row = n - 7;
        int m_col = m - 7;

        // 8 x 8 체스판 크기에 맞춰 탐색 시작 지점 변경
        for (int i = 0; i < n_row; i++) {
            for (int j = 0; j < m_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
        br.close();
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean tf = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                if (arr[i][j] != tf) {
                    count++;
                }

                // 다음 칸 check는 boolean 값을 바꿔준다.
                tf = (!tf);
            }
            tf = (!tf);
        }

        // 첫 번째 칸을 기준으로 어떤 색으로 칠할지(W, B) min값으로 판단
        count = Math.min(count, 64 - count);

        // 이전까지의 경우 중 최솟값보다 현재 count 값이 더 작을 경우 최솟값을 갱신
        min = Math.min(min, count);
    }
}