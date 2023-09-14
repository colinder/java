package toString;

import java.io.*;

public class toString {
    public static void main(String[] args) throws IOException {
        int a = 123;

        if ("" + a instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("NOT String");
        }


        if (String.valueOf(a) instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("NOT String");
        }


        

    }
}
