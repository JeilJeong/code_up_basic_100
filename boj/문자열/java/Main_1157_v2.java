// 288ms

// v1의 경우 문제의 방향을 잘못 이해해 아예 다른 코드를 작성했음 > 따라서 정답 코드 재작성

// input string의 길이가 변수로 주어진다. 이외에 26개의 알파벳에 대해 2차례의 반복문을 돌게 된다 > 따라서 O(n) 알고리즘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read from the user
        String str = br.readLine().toUpperCase();

        //make an array to count alphabets frequency
        int len = 'Z' - 'A' + 1;
        int[] count = new int[len];
        int str_len = str.length();
        for (int i = 0; i < str_len; i++) {
            count[str.charAt(i) - 'A'] += 1;
        }
        // find max
        int max = -1;
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (max < count[i]) {
                max = count[i];
                count[i] = -1;
                index = i;
            }
        }
        // check if same frequency is exist
        for (int i = 0; i < len; i++) {
            if (max == count[i]) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)((int)'A' + index));
        br.close();
    }
}