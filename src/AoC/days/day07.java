package AoC.days;

import AoC.day;

import java.util.*;

public class day07 implements day {

    @Override
    public String part1(List<String> input) {
        HashMap<String, Object> root = new HashMap<>();
        HashMap<String, Object> dirs = root;
        Stack<HashMap<String, Object>> stack = new Stack<>();

        for (String s : input) {
            if (s.charAt(0) == '$') {
                if (s.charAt(2) == 'c') {
                    String dir = s.substring(5);
                    if (dir.equals("/")) {
                        dirs = root;
                        stack.clear();
                    } else if (dir.equals("..")) {
                        dirs = stack.pop();
                    } else {
                        if (!dirs.containsKey(dir)) {
                            dirs.put(dir, new HashMap<String, Object>());
                        }
                        stack.push(dirs);
                        dirs = (HashMap<String, Object>) dirs.get(dir);
                    }
                }
            } else {
                String[] parts = s.split(" ");
                String dirOrSize = parts[0];
                String name = parts[1];
                if (dirOrSize.equals("dir")) {
                    if (!dirs.containsKey(name)) {
                        dirs.put(name, new HashMap<String, Object>());
                    }
                } else {
                    dirs.put(name, Integer.parseInt(dirOrSize));
                }
            }
        }
        return String.valueOf(sumDirs(root)[1]);
    }

    int[] sumDirs(HashMap<String, Object> dir) {
        int size = 0;
        int res = 0;
        for (Object child : dir.values()) {
            if (child instanceof HashMap) {
                int[] s = sumDirs((HashMap<String, Object>) child);
                res += s[1];
                size += s[0];
            } else if (child instanceof Integer) {
                size += (int) child;
            }
        }
        if(size < 100000){
            res += size;
        }
        return new int[] {size, res};
    }

    @Override
    public String part2(List<String> input) {
        HashMap<String, Object> root = new HashMap<>();
        HashMap<String, Object> dirs = root;
        Stack<HashMap<String, Object>> stack = new Stack<>();

        for (String s : input) {
            if (s.charAt(0) == '$') {
                if (s.charAt(2) == 'c') {
                    String dir = s.substring(5);
                    if (dir.equals("/")) {
                        dirs = root;
                        stack.clear();
                    } else if (dir.equals("..")) {
                        dirs = stack.pop();
                    } else {
                        if (!dirs.containsKey(dir)) {
                            dirs.put(dir, new HashMap<String, Object>());
                        }
                        stack.push(dirs);
                        dirs = (HashMap<String, Object>) dirs.get(dir);
                    }
                }
            } else {
                String[] parts = s.split(" ");
                String dirOrSize = parts[0];
                String name = parts[1];
                if (dirOrSize.equals("dir")) {
                    if (!dirs.containsKey(name)) {
                        dirs.put(name, new HashMap<String, Object>());
                    }
                } else {
                    dirs.put(name, Integer.parseInt(dirOrSize));
                }
            }
        }
        int needToFree = size(root) - 40000000;
        return String.valueOf(freeSpace(root, needToFree));
    }

    int size(HashMap<String, Object> dir) {
        int size = 0;
        for (Object child : dir.values()) {
            if (child instanceof HashMap) {
                size += size((HashMap<String, Object>) child);
            } else if (child instanceof Integer) {
                size += (int) child;
            }
        }
        return size;
    }

    int freeSpace(HashMap<String, Object> dir, int space){
        int res = Integer.MAX_VALUE;
        if(size(dir) >= space){
            res = size(dir);
        }
        for (Object child : dir.values()){
            if (child instanceof HashMap) {
                int resChild = freeSpace((HashMap<String, Object>) child, space);
                res = Math.min(res, resChild);
            }
        }
        return res;
    }

}
