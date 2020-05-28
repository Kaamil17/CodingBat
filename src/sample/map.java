package sample;

import java.beans.PropertyEditorManager;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Map;

public class map {
    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        return map;
    }


    public Map<String, String> mapAB(Map<String, String> map) {
        String append = "";

        if (map.containsKey("a") && map.containsKey("b")) {
            append = map.get("a") + map.get("b");
            map.put("ab", append);
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");

        if (map.containsKey("ice cream")) {
            map.put("ice cream", " cherry");
        }
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {

        if (map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {

        if (map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }

        if (map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {

        if (map.get("a") != null && map.get("b") == null) {
            map.put("b", map.get("a"));
        } else if (map.get("a") == null && map.get("b") != null) {
            map.put("a", map.get("b"));
        }
        return map;
    }


    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.get("a") != null && map.get("b") != null) {
            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else {
                    map.put("c", map.get("b"));
                }
            } else {
                map.put("a", "");
                map.put("b", "");
            }

        }
        return map;
    }

    // Map 2

    // hashmap doesn't allow duplicate keys, but it does allow duplicate values.

    public Map<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String elements : strings) {
            map.put(elements, 0);
        }
        return map;
    }


    public Map<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String element : strings) {
            int length = element.length();
            map.put(element, length);
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {

        HashMap<String, String> map = new HashMap<>();

        for (String element : strings) {
            map.put(element.substring(0, 1), element.substring(element.length() - 1));
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String element : strings) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String element : strings) {
            map.put(element, map.containsKey(element));
        }
        return map;
    }


    public static Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<String, String>();

        for (String string : strings) {

            String key = String.valueOf(string.charAt(0));

            if (map.containsKey(key)) {
                String value = map.get(key) + string;
                map.put(key, value);
            } else {
                map.put(key, string);
            }
        }
        return map;
    }

    public int binarySearch(int[] array, int number, int n) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int med = (low + high) / 2;
            if (number == med)
                return med;
            else if (number < array[med])
                return high = med - 1;
            else low = med + 1;
        }
        return -1;
    }


}
