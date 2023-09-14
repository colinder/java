package baekJoon.Math1;

import java.io.*;
import java.util.*;

public class VMath1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int count_sum = 0;

        while(true) {
            if (N <= count_sum + cross_count) {
                if (cross_count%2 == 0) {
                    System.out.println((N - count_sum) + "/" + (cross_count - (N - count_sum - 1)));
                    break;
                } else {
                    System.out.println((cross_count - (N - count_sum - 1)) + "/" + (N - count_sum));
                    break;
                }
            } else {
                count_sum += cross_count;
				cross_count++;
            }
        }

        br.close();
    }
}
