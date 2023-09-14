package baekJoon.Math1;

import java.io.*;
import java.util.*;

public class Math2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.parseInt(br.readLine());

        int i = 0;
        if (Number == 1) {
            System.out.println(1);

        } else {
            while(true) {
                int step = (int)(3*Math.pow(i, 2) - 3*i +2);
                if (Number >= step) {
                    i += 1;
                } else {
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
