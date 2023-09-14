package baekJoon.intro;

import java.io.*;

public class Intro2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        String input2 = br.readLine();

        int one = Integer.parseInt(input1);
        int two = Integer.parseInt(input2);

        for (int i=input2.length()-1; i > -1; i--) {
          char value = input2.charAt(i);
          int digit = Character.getNumericValue(value);
          System.out.println(digit * one);
        }
        System.out.println(one * two);

        br.close();
    }
}
