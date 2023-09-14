package baekJoon.Math1;

import java.io.*;
import java.util.*;

public class Math2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));

    }
}
