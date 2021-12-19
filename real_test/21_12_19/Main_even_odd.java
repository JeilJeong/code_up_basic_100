import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_even_odd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cycle = Integer.parseInt(br.readLine());
        for (int k = 0; k < cycle; k++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            PriorityQueue<Integer> max_queue = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> min_odd_queue = new PriorityQueue<>();
            PriorityQueue<Integer> min_even_queue = new PriorityQueue<>();
            int target = 0;
            for (int i = 0; i < num; i++) {
                target = Integer.parseInt(st.nextToken());
                max_queue.offer(target);
                if (target % 2 == 0) {
                    min_even_queue.offer(target);
                } else {
                    min_odd_queue.offer(target);
                }
            }
            num /= 2;
            int sum = 0;
            int my_num = 0;
            Integer your_num = 0;
            boolean flag = false;
            for (int i = 0; i < num; i++) {
                my_num = max_queue.poll();
                popPropagation(my_num, min_odd_queue, min_even_queue);
                if (my_num % 2 == 0) {
                    your_num = min_even_queue.peek();
                    if (your_num != null) {
                        your_num = min_even_queue.poll();
                        popPropagation(your_num, max_queue);
                    } else {
                        flag = true;
                        if (i != num - 1) {
                            i--;
                            continue;
                        }
                    }
                } else {
                    your_num = min_odd_queue.peek();
                    if (your_num != null) {
                        your_num = min_odd_queue.poll();
                        popPropagation(your_num, max_queue);
                    } else {
                        flag = true;
                        if (i != num - 1) {
                            i--;
                            continue;
                        }
                    }
                }
                if (flag == true && i == num - 1) {
                    Integer check_pop_overflow = min_even_queue.peek() == null ? min_odd_queue.poll() : min_even_queue.poll();
                    sum += check_pop_overflow == null ? my_num : check_pop_overflow;
                } else {
                    sum += my_num;
                }
            }
            System.out.println("#" + (k + 1) + " " + sum);
        }
        br.close();
    }

    public static void popPropagation(int num, PriorityQueue<Integer> ... targets) {
        for (PriorityQueue<Integer> target : targets) {
            target.remove(num);
        }
    }
}