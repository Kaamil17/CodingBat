import javax.naming.PartialResultException;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

// Warm up 1 and Warm up 2

public class newLife {
    public static void main(String[] args) {
    }


    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            if (((nums[i + 1] == (value + 5)) && Math.abs(nums[i + 2] - (value - 1)) <= 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }


    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            result = result + str.charAt(i);
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1);
            }
        }
        return result;

    }


    public String stringX(String str) {

        if (str.length() < 2) return str;

        int lastChar = str.length() - 1;
        String result = "";

        String frontString = str.substring(0, 1);
        String backString = str.substring(lastChar);
        String medString = str.substring(1, lastChar);

        for (int i = 0; i < medString.length(); i++) {
            result = medString.replace("x", "");
        }
        return frontString + result + backString;
    }


    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.replace("yak", "");
        }
        return result;

    }

    public int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
                counter++;
            }
        }
        return counter;

    }


    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                return false;
        }
        return true;

    }

    public String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }


    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        }
        return (b <= 20 && b >= 10);
    }

    public String stringTimes(String str, int n) {

        String string = "";
        for (int i = 0; i < n; i++) {
            string = string + str;
        }
        return string;
    }


    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();

        int last = str.length() - 3;

        String frontString = str.substring(0, last);
        String backString = str.substring(last);

        return frontString + backString.toUpperCase();
    }


    public String everyNth(String str, int n) {

        String res = "";
        for (int i = 0; i < str.length(); i = i + n) {
            res = res + str.charAt(i);
        }

        return res;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                result = result + str;
            }
        } else {
            String frontString = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                result = result + frontString;
            }
        }
        return result;
    }

    int countXX(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx"))
                counter++;
        }
        return counter - 1;
    }


    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int number : nums) {
            if (number == 9) {
                counter++;
            }
        }
        return counter;
    }


    public boolean arrayFront9(int[] nums) {

        int[] newArray = Arrays.copyOfRange(nums, 0, 4);
        for (int i = 0; i < 4; i++) {
            if (newArray[i] == 9)
                return true;
        }
        return false;
    }


    public String frontBack(String str) {
        if (str.length() < 2) return str;

        int lastChar = str.length() - 1;

        String frontString = str.substring(0, 1);
        String middleString = str.substring(1, lastChar);
        String lastString = str.substring(lastChar);

        return lastString + middleString + frontString;
    }

    public String front3(String str) {
        if (str.length() < 3) return str + str + str;

        String threeString = str.substring(0, 3);
        String result = "";

        for (int i = 0; i <= 3; i++) {
            result = result + threeString;
        }
        return result;
    }


    public int max1020(int a, int b) {
        int temp;
        if (b > a) {
            temp = a;
            a = b;
            temp = b;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }


    public String backAround(String str) {
        String newString = str.substring(str.length() - 1);
        return newString + str + newString;
    }


    public boolean lastDigit(int a, int b) {
        int firstNumber = a % 10;
        int secNumber = b % 10;

        return (firstNumber == secNumber);
    }


    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);

        }
        return str;
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public int close10(int a, int b) {

        int firstDiff = Math.abs(a - 10);
        int secondDiff = Math.abs(b - 10);
        int zero = 0;

        if (firstDiff > secondDiff) {
            return b;
        }
        if (firstDiff < secondDiff) {
            return a;
        } else {
            return zero;
        }
    }


    public static boolean stringE(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() + 1; i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        return (counter <= 3 && counter >= 1);
    }


    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        return a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }


    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public boolean mixStart(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(1, 3).equals("ix"));
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return ((aTeen && !bTeen) || (!aTeen && bTeen));
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) && (b >= 13 && b <= 19) || ((c >= 13 && c <= 19)));
    }


    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }


    public String front22(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.length() > 1) {
            String front = str.substring(0, 2);
            return front + str + front;
        } else {
            String newfront = str.substring(0, 1);
            return newfront + str + newfront;
        }
    }


    public boolean startHi(String str) {
        if (str.length() == 1 || str.equals("")) {
            return false;
        }
        String newString = str.substring(0, 2);
        return newString.contains("hi");
    }

    public boolean or35(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return n % 5 == 0;
    }


    public static boolean only14(int[] numners) {
        for (int i = 0; i < numners.length; i++) {
            if (numners[i] == 1 && numners[i] == 4)
                return false;
        }
        return true;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7) {
            return true;
        }
        return talking && hour > 20;
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(n - 100) <= 10)) {
            return true;
        }
        return Math.abs(n - 200) <= 10;
    }


    public String notString(String str) {

        if (str.equals("not" + str)) {
            return str;
        } else {
            return "not " + str;
        }
    }

    //public String notString(String str) {
    //     if(str.length() >= 3 && str.substring(0,3).equals("not")){
    //       return str;
    //    } else {
    //          return "not " + str;
    //     }
    //  }


    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;

    }


    public int diff21(int n) {
        int diff = 0;
        if (n <= 21) {
            diff = n - 21;
            return Math.abs(diff);
        } else {
            return (n - 21) * 2;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a == b) {
            int total = a + b;
            sum = total * 2;
            return sum;
        } else {
            sum = a + b;
        }
        return sum;
    }


    public static int average(int... number) {
        // da da da are used when we don't know how many arguments we will have.

        int total = 0;
        for (int numbers :
                number) {
            total += numbers;
        }
        return total / number.length;
    }


    public static void changeLetters(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 6;
        }
        System.out.println(array);
    }

    static void myFunction(int number) {
        if (number % 2 == 0) {
            if (number > 2 && number < 5) {
                System.out.println("Not Weird");
            }
            if (number > 6 && number <= 20) {
                System.out.println("Weird");
            }
            if (number > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}


// for "A nd", both of them must be true.
// for "OR", in order to get "true", one of them must be true.
