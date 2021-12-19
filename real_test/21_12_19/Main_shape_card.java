import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_shape_card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cycle = Integer.parseInt(br.readLine());
        for (int i = 0; i < cycle; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                ArrayList<String> list = new ArrayList<String>();
                list.add(br.readLine());
            }

        }
        br.close();
    }
}