package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i =0; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for (int e: arr) {
            if (e == v) {
                count += 1;
            }
        }

        System.out.println(count);
    }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     System.out.println(Arrays.toString(arr)); // 배열의 내용이 출력됨
    // }
}
