package HC.Q4;

import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) throws IOException {
        String s1 = "abd";
        String s2 = "ad";
        boolean result = isSubsequence(s1, s2);
        System.out.println(result); // Output: true

        s1 = "zc";
        s2 = "ad";
        result = isSubsequence(s1, s2);
        System.out.println(result); // Output: true
    }

    public static boolean isSubsequence(String s1, String s2) {
        String temp = s1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)+1 == 123) {
                temp += 'a';
            } else {
                temp += (char) (s1.charAt(i)+1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            String a = Character.toString(s2.charAt(i))  ;
            if (!temp.contains(a)) {
                return false;
            }            
        }
        return true;
    }        
}
