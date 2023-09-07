package inputOutput;

import java.util.*;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // int만 받음.
        System.out.println(i);
        sc.close();
    }
}
