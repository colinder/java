package map;

import java.io.*;
import java.util.*;

public class init {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("kk", 4);
        map.put("k", 10);
        System.out.println(map); // {kk=4, k=10}
    }
}
