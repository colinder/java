package string;

import java.io.*;

public class forEach {
    public static void main(String[] args) throws IOException {
        String s = "hello new world!";

        for (char e : s.toCharArray()) {
            System.out.println(String.valueOf(e));
        } 
    }
}
