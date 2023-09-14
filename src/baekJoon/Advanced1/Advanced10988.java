package baekJoon.Advanced1;

import java.io.*;
import java.util.*;

public class Advanced10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = 1;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(s.length()-1-i)) {
                continue;
            } else {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}
