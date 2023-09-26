package source;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        // String alpa = "abcdefghijklmnopqrstuvwxyz";
        // String Ualpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Map<String, Integer> map = new HashMap<>();
        // map.put("kk", 4);
        // map.put("k", 10);
        // System.out.println(map); // {kk=4, k=10}
        char charValue = 'Aaa';

        if(Character.isUpperCase(charValue)) {
            System.out.println("A는 대문자입니다.");
        }

        if(Character.isLowerCase(charValue)) {
            System.out.println("A는 소문자입니다.");
        }
        

    }
}
