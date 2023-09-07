package inputOutput;

import java.util.*;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.getClass().getName());
        System.out.println(a);
        sc.close();
    }
}
