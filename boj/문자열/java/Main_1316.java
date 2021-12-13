// 파이썬 버전의 경우 문자열을 복사하여 space를 waste했지만, java 버전의 경우 while문을 사용한 j index 조절을 통해
// 오직 26개의 alphabet checking 공간만 사용하여 공간을 절약함

// 단, 문제는 코드를 직관적으로 이해하기 어렵고, index out of bound 문제 & j--를 통해 index를 증감을 control해야 하는 복잡한 로직 이해가 필요함

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int[] check = new int[26];
            int error = 1;
            for (int j = 0; j < str.length(); j++) {
                int criterion = str.charAt(j);
                if (check[str.charAt(j) - 'a'] == 0) {
                    int index = j;
                    // add range checking
                    while (j < str.length() && str.charAt(j) == criterion) {
                        j++;
                    }
                    check[str.charAt(index) - 'a'] = 1;
                    // add j-- and range checking
                    if (j == str.length()) {
                        break;
                    }
                    j--;
                } else if (check[str.charAt(j) - 'a'] == 1) {
                    error = 0;
                    break;
                }
            }
            if (error != 0)
                count += 1;
        }
        System.out.println(count);
        br.close();
    }
}