// 124ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] c_alpha = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        String target = br.readLine();
        for (int i = 0; i < c_alpha.length; i++) {
            target = target.replaceAll(c_alpha[i], "_");
        }
        System.out.println(target.length());
        br.close();
    }
}