package HC;

import java.io.*;
import java.util.*;

public class Main {
    private static Map<String, Integer> pathMap;

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static boolean createPath(String path, int value) {
        if (path == null || path.isEmpty() || path.equals("/") || pathMap.containsKey(path)) {
            return false;
        }

        String[] segments = path.split("/");
        StringBuilder currentPath = new StringBuilder("/");
        System.out.println(currentPath);
        
        for (int i = 1; i < segments.length - 1; i++) {
            currentPath.append(segments[i]);
            if (!pathMap.containsKey(currentPath.toString())) {
                return false; // Parent path doesn't exist
            }
            currentPath.append("/");
        }

        pathMap.put(path, value);
        return true;
    }
}
