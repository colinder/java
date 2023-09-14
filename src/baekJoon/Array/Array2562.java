package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        for (int i=0; i <9; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > max) {
                max = value;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);

        br.close();
    }
}
