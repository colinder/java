package baekJoon.intro;

import java.io.*;

public class Intro10869 {
    static int a, b;
    static double c, d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        c = Integer.parseInt(input[0]);
        d = Integer.parseInt(input[1]);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        br.close();
    }
}
