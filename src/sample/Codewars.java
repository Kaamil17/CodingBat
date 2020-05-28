package sample;

import java.awt.event.MouseAdapter;
import java.rmi.MarshalledObject;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.Arrays.mismatch;
import static java.util.Arrays.sort;

public class Codewars {

    public static void main(String[] args) {
        System.out.println(reverseWords(" "));

    }


    public static String reverseWords(final String original) {

        String[] array = original.split(" ");
        String reverseWord = "";
        if (original.isEmpty()) return original;

        for (String elemnt : array) {
            StringBuilder stringBuilder = new StringBuilder(elemnt);
            stringBuilder.reverse();
            reverseWord += stringBuilder.toString() + " ";


        }
        return reverseWord.trim();

    }


    public static int findShort(String s) {

        // split split the words in between according to the regex.

        String [] words = s.split(" ");
        String first = words[0];

        for (int i = 1; i < words.length; i++) {
            if (first.length() > words[i].length()) {
                first = words[i];
            }
        }
        return first.length();
    }

    public static int[] take(int[] arr, int n) {
        if (arr.length == 0) return arr;
        return Arrays.copyOfRange(arr, 0, n);
    }

    public long numberOfDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 ) {
                count++;
            }
        }
        return count;
    }

    static int stray(int[] numbers) {

        int result = 0;
        if (numbers.length == 0) return numbers[0];
            for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i - 1] == numbers[i] && Math.abs(numbers[i] - numbers[i + 1]) != 0) {
                result = numbers[i + 1];
            }
        }
        return result;
    }


    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }
        return result.toString();

    }

    public static String getMiddle(String word) {
        //Code goes here
        if (word.length() == 1) return word;
        int size = word.length() / 2;

        if (word.length() % 2 == 0) {
            return word.substring(size - 1, size + 1);
        } else {
            return word.substring(size, size + 1);
        }
    }

    public static int opposite(int number) {
        // your code here
        if (number < 0) {
            number = Math.abs(number);
        } else {
            number = -(number);
        }
        return number;
    }


    // finding a non consecutive number.
    static Integer find(final int[] array) {
        int result = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) == 2) {
                result = array[i + 1];
                return result;
            }
        }
        return null;
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null) return null;
        if (phrase.isEmpty()) return null;


        String[] array = phrase.split(" ");
        StringBuilder outString = new StringBuilder();

        for (String element : array) {
            outString.append(capitalize(element)).append(" ");
        }
        return outString.substring(0, outString.length() - 1);
    }

    private static String capitalize(String element) {
        return Character.toUpperCase(element.charAt(0)) + element.substring(1);
    }

    // better version
    public static String ttoJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

    public static String solution(String str) {
        // Your code here...

        if (str.isEmpty()) return "";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isDivisible(long n, long x, long y) {
        // your code
        return n % x == 0 && n % y == 0;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int total = 0;

        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i] + arr2[i];
        }
        return total;
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int total = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep == null) {
                continue;
            }
            if (arrayOfSheep) {
                total++;
            }
        }
        return total;
    }

    public static boolean check(Object[] a, Object x) {
        // Your code here

        for (Object o : a) {
            if (o == x) {
                return true;
            }
        }
        return false;
    }


    public static int findSmallestInt(int[] args) {
        int first = args[0];

        for (int i = 0; i < args.length - 1; i++) {
            if (first > args[i + 1]) {
                first = args[i + 1];

            }
        }
        return first;
    }

    public static boolean validatePin(String pin) {
        // Your code here
        return pin.matches("\\d{4}|\\d{6}");
    }

    //    return String.format("found the needle at position %d",
    //    java.util.Arrays.asList(haystack).indexOf("needle"));

    public static String findNeedle(Object[] haystack) {
        // Your code here
        int pos = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                pos = i;
            }
        }
        return "soound the needle at position " + pos;
    }


}
