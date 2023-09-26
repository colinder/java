package number;

import java.io.*;

public class number {
    public static void main(String[] args) throws IOException {
        // 10진수 -> 2진수, 8진수, 16진수
        int num = 10;

        String num2 = Integer.toBinaryString(num);
        String num8 = Integer.toOctalString(num);
        String num16 = Integer.toHexString(num);

        System.out.println(num2 + "/" + num8 + "/" + num16);
        
        // 2진수, 8진수, 16진수 -> 10진수
        
        int num2_10 = Integer.parseInt(num2, 2);
        int num8_10 = Integer.parseInt(num2, 8);
        int num16_10 = Integer.parseInt(num2, 16);

        System.out.println(num2_10 + "/" + num8_10 + "/" + num16_10);
    }
}
