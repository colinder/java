import java.util.*;

class JavaFileSystem {
    private Map<String, Integer> pathMap;

    public JavaFileSystem() {
        pathMap = new HashMap<>();
        pathMap.put("/", -1);

    }

    public boolean createPath(String path, int value) {
        if (path == null || path.isEmpty() || path.equals("/")) {
            // Invalid path
            return false;
        }
        
        if (pathMap.containsKey(path)) {
            // Path already exists
            return false;
        }
        
        // int lastIndex = path.lastIndexOf("/");
        // String parentPath = path.substring(0, lastIndex);
        if (!pathMap.containsKey(path)) {
            // Parent path doesn't exist
            return false;
        }

        pathMap.put(path, value);
        return true;
    }

    public int get(String path) {
        if (pathMap.containsKey(path)) {
            return pathMap.get(path);
        } else {
            return -1; // Path doesn't exist
        }
    }
}