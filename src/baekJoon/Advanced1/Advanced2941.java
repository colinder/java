package baekJoon.Advanced1;

import java.io.*;
import java.util.*;

public class Advanced2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        // 간결한 코드
        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=" ,"z="};

        String s = br.readLine();

        for (int i = 0; i < str.length; i++) {
            if (s.contains(str[i])) {
                s = s.replace(str[i], "!");
            }
        }

        System.out.println(s.length());

        br.close();

        // 내가 짠 코드 
        // String s = br.readLine();
        // String c = "";
        // int count =0;
        
        // while (s.contains("dz=")) {
        //     s = s.replace("dz=", "!");
        //     c += "dz=";
        //     count += 1;
        // }
        // while (s.contains("c=")) {
        //     s = s.replace("c=", "!");
        //     c += "c=";
        //     count += 1;
        // }
        // while (s.contains("c-")) {
        //     s = s.replace("c-", "!");
        //     c += "c-";
        //     count += 1;
        // }
        // while (s.contains("d-")) {
        //     s = s.replace("d-", "!");
        //     c += "d-";
        //     count += 1;
        // }
        // while (s.contains("lj")) {
        //     s = s.replace("lj", "!");
        //     c += "lj";
        //     count += 1;
        // }
        // while (s.contains("nj")) {
        //     s = s.replace("nj", "!");
        //     c += "nj";
        //     count += 1;
        // }
        // while (s.contains("s=")) {
        //     s = s.replace("s=", "!");
        //     c += "s=";
        //     count += 1;
        // }
        // while (s.contains("z=")) {
        //     s = s.replace("z=", "!");
        //     c += "z=";
        //         count += 1;
        // }

        // System.out.println(s.length());
        

        // br.close();

    }
}
