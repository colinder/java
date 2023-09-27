package HC.Q5;

import java.io.*;
import java.util.*;

class javaFileSystem {
    public static Map<String, Integer> pathMap;

    public javaFileSystem() {
        pathMap = new HashMap<>();
        pathMap.put("/", -1);
    }

    public boolean createPath(String path, int value) {
        if ( path == null || path.isEmpty() || path.equals("/") || pathMap.containsKey(path)) {
            return false;
        }

        String[] segments = path.split("/");
        StringBuilder currentPath = new StringBuilder("/");
        
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

    public int get(String path) {
        return pathMap.getOrDefault(path, -1);
    }

}
