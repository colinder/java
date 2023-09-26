package baekJoon.String;

import java.io.*;

public class String5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if ("ABC".contains(arr[i])) {
                total += 3;
            } else if ("DEF".contains(arr[i])) {
                total += 4;
            } else if ("GHI".contains(arr[i])) {
                total += 5;
            } else if ("JKL".contains(arr[i])) {
                total += 6;
            } else if ("MNO".contains(arr[i])) {
                total += 7;
            } else if ("PQRS".contains(arr[i])) {
                total += 8;
            } else if ("TUV".contains(arr[i])) {
                total += 9;
            } else {
                total += 10;
            }
        }

        System.out.println(total);

        br.close();
    }
}
