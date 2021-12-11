import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String chr = br.readLine();
        int result = (int) chr.charAt(0);
        System.out.println(result);
        br.close();
    }
}