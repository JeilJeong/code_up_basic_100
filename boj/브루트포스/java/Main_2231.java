// 직접 작성한 코드로 채점 중간에 틀렸다고 나오지만 어떤 부분이 정답과 다른 코드인지는 확인하지 못했음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num_str = br.readLine();
        int num_str_len = num_str.length();

        int origin_num = Integer.parseInt(num_str);

        // num_str_len * 9만큼이 각 자리 수의 최댓값을 의미
        int max = num_str_len * 9;

        // origin_num - max 값으로부터 하나씩 증가하며 생성자를 탐색
        int increase_num = origin_num - max;

        int target_num = 0;
        while (true) {
            target_num = digit_sum(increase_num);
            if (target_num > origin_num) {
                System.out.println(0);
                break;
            }
            else if (target_num == origin_num) {
                System.out.println(increase_num);
                break;
            }
            increase_num++;
        }
        br.close();
    }

    public static int digit_sum(int num) {
        int result = 0;
        int tmp_num = num;

        while (tmp_num > 0) {
            result += tmp_num % 10;
            tmp_num /= 10;
        }

        result += num;
        return result;
    }
}