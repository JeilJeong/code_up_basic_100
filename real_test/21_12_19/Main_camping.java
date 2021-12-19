import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cycle = Integer.parseInt(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] map = new int[n];
            for (int j = 0; j < n; j++) {
                map[j] = Integer.parseInt(st.nextToken());
            }

            int target_base = 0;
            int k = 0;
            for (; k < n; k++) {
                if (map[(n - 1) - k] == 3) {
                    target_base = (n - 1) - k;
                    break;
                }
            }
            if (k == n) {
                System.out.println("#" + (i + 1) + " -1");
                continue;
            }

            int total_move = 0;
            int sub_move = 0;
            int result = 0;
            boolean stop_flag = false;
            boolean no_rest_flag = false;
            int p = target_base;
            for (; p > 0; p--) {
                if (map[p] == 3) {
                    result += total_move;
                    total_move = 0;
                    sub_move = 0;
                } else if (map[p] == 2) {
                    // 특수 탐색 = 최대한 휴게소는 방문하지 않는 시나리오
                    int search_distance = 6 - sub_move;
                    for (int q = p - 1; q > 0 && q >= p - search_distance; q--) {
                        if (map[q] == 2 || map[q] == 3) {
                            no_rest_flag = true;
                            break;
                        }

                    }
                    if (no_rest_flag) {
                        total_move += 1;
                        sub_move += 1;
                        no_rest_flag = false;
                        continue;
                    } else {
                        sub_move = 0;
                        total_move += 1;
                    }
                }
                total_move += 1;
                sub_move += 1;
                if (sub_move > 6 || total_move > 13) {
                    stop_flag = true;
                    break;
                }
            }
            if (stop_flag) {
                System.out.println("#" + (i + 1) + " -1");
                continue;
            }
            if (p == 0)
                result += total_move - 1;
            System.out.println("#" + (i + 1) + " " + result);
        }
        br.close();
    }
}