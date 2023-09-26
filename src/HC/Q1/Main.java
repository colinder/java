package HC.Q1;

import java.io.*;
import java.util.*;

import string.string;

class JavaCyclicIncrements {

    public static boolean canMakeSubsequence() {
        String s1 = "abc";
        String s2 = "ad";

        int n = s1.length();
        int m = s2.length();

        int[] arr1 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i)-97] += 1;            
        }
        
        
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            if (arr1[a] == 0) {
                if (a == 122 && arr1[0] == 0 ) {
                    return false;
                }
            }
        }       
        
        return true;
    }

    public static void main(String[] args) {
        canMakeSubsequence();
    }
}
