package sample;

import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.Arrays;


//String 2;
public class Strings {

    public static void main(String[] args) {

    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) return false;

        if (nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
                (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2)))
            return false;

        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2)
                return false;
        }
        return true;
    }

    public boolean haveThree(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        for (int num : nums) {
            if (num == 3) {
                counter++;
            }
        }
        return counter == 3;
    }

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean catDog(String str) {
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                counter1++;
            }
            if (str.startsWith("dog", i)) {
                counter2++;
            }
        }
        return counter1 == counter2;
    }

    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if ((str.startsWith("co", i) && str.charAt(i + 3) == 'e')) {
                counter++;
            }
        }
        return counter;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("b", i) && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


    public boolean xyBalance(String str) {
        return str.lastIndexOf('y') >= str.lastIndexOf('x');
    }

    public String repeatEnd(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + str.substring(str.length() - n);
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result = "";

        for (int i = n; i >= 0; i--) {
            result = result + str.substring(0, i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {

        String result = word;
        if (count == 0) return "";
        for (int i = 1; i < count; i++) {
            result = result + sep + word;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String neString = str.substring(0, n);
        String seString = str.substring(n);

        for (int i = 0; i < str.length(); i++) {
            if (seString.contains(neString)) {
                return true;
            }
        }
        return false;
    }

    public boolean endOther(String a, String b) {
        String firstString = a.toLowerCase();
        String secondString = b.toLowerCase();

        if (firstString.endsWith(secondString)) return true;
        return secondString.endsWith(firstString);
    }

    public String mixString(String a, String b) {
        String result = "";
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        return result + b.substring(min) + a.substring(min);
    }

    public boolean xyzThere(String str) {
        return str.length() >= 3 && !str.endsWith("xy") && !str.endsWith(".xyz");
    }

    public boolean xyzMiddle(String str) {

        if (str.length() < 3) return false;

        int index = str.indexOf("xyz", str.length() / 2 - 3);
        String firstString = str.substring(0, index);
        String secondString = str.substring(index);

        return (firstString.length() == secondString.length() || firstString.length() + 1 == secondString.length() ||
                firstString.length() == secondString.length() + 1);
    }

    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.startsWith("*", i) && !str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
                return false;
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String result = "";

        for (int i = 0; i < str.length() - 2; i += 3) {
            result = result + str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return result;

    }

    public String zipZap(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.length() < 3) return str;
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'z') {
                result = result + "zp";
                i += 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }


    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }


    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {

        if (a.length >= 1 && b.length >= 1) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        return false;
    }

    public int sum3(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        return total;
    }

    public int[] reverse3(int[] nums) {

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }

    public int[] rotateLeft3(int[] nums) {

        // return new int [] {num[1], num[2], num[3]}

        int temp = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        // we can use Math.max as well;
        if (nums[0] > nums[nums.length - 1]) return new int[]{nums[0], nums[0], nums[0]};
        return new int[]{nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
    }

    public int sum2(int[] nums) {
        int total = 0;
        if (nums.length <= 2) {
            for (int num : nums) {
                total = total + num;
            }
        } else {
            total = total + nums[0] + nums[1];
        }

        return total;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {

        int[] values = new int[nums.length * 2];

        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
        values[values.length - 1] = nums[nums.length - 1];

        return values;
    }

    public boolean double23(int[] nums) {
        int total = 0;
        int total1 = 0;

        for (int num : nums) {
            if (num == 2) {
                total++;
            }
            if (num == 3) {
                total1++;
            }
        }

        if (total == 2) return true;
        return total1 == 2;
    }

    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int total = 0;

        for (int value : a) {
            if (value == 1) {
                total++;
            }
        }
        for (int value : b) {
            if (value == 1) {
                total++;
            }
        }
        return total;

    }

    public int[] biggerTwo(int[] a, int[] b) {

        int sum = 0;
        int sum2 = 0;

        for (int value : a) {
            sum = sum + value;
        }

        for (int value : b) {
            sum2 = sum2 + value;
        }

        if (sum == sum2) return a;
        if (sum > sum2) return a;

        return b;
    }


    public int[] makeMiddle(int[] nums) {
        if (nums.length == 2) return nums;

        int middle = nums.length / 2;
        return new int[]{nums[middle - 1], nums[middle]};

    }

    public int[] plusTwo(int[] a, int[] b) {


        // The arraycopy(array1, 0, result, 0, aLen) function, in simple terms,
        // tells the program to copy array1 starting
        // from index 0 to result from index 0 to aLen.
        int length = a.length + b.length;

        int[] result = new int[length];
        int pos = 0;

        for (int element : a) {
            result[pos] = element;
            pos++;
        }

        for (int element : b) {
            result[pos] = element;
            pos++;
        }

        return result;
        //return new int[] {a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;

    }

    public int[] midThree(int[] nums) {
        if (nums.length == 3) return nums;

        int middle = nums.length / 2;
        return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};

    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        } else
            return new int[]{nums[0], nums[1]};
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return new int[]{};
        if (a.length > 0 && b.length == 0) return new int[]{a[0]};
        if (b.length > 0 && a.length == 0) return new int[]{b[0]};

        return new int[]{a[0], b[0]};

    }

    public boolean unlucky1(int[] nums) {
        if (nums.length <= 1) return false;
        if (nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        if (nums[0] == 1 && nums[1] == 3) {
            return true;
        }
        return nums[nums.length - 1] == 3 && nums[nums.length - 2] == 1;
    }


    public int[] make2(int[] a, int[] b) {
        if (a.length == 3 && b.length == 2) return new int[]{a[0], a[1]};

        if (a.length == 0) return b;

        if (b.length == 0) return new int[]{a[0], a[1]};

        if (b.length == 2) {
            return b;
        }

        if (a.length == 2) {
            return a;
        }
        return new int[]{a[0], b[0]};
    }

    public int maxTriple(int[] nums) {

        int firstElement = nums[0];
        int middleElement = nums[nums.length / 2];
        int lastElement = nums[nums.length - 1];

        if (firstElement > middleElement && firstElement > lastElement) return firstElement;

        if (middleElement > firstElement && middleElement > lastElement) return middleElement;

        return lastElement;

    }

    public int countEvens(int[] nums) {
        int counter = 0;
        for (int elements : nums) {
            if (elements % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }


    public int bigDiff(int[] nums) {

        if (nums.length == 2) return Math.abs(nums[0] - nums[1]);

        int number = nums[0];
        int fistValue;
        int secondValue;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > number) {
                number = nums[i];
            }
        }
        fistValue = number;


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < number) {
                number = nums[i];
            }
        }
        secondValue = number;

        return Math.abs(fistValue - secondValue);
    }

    public int sum13(int[] nums) {
        int total = 0;
        if (nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                total = total + nums[i];
            } else {
                i = i + 1;
            }
        }
        return total;
    }

    public boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int elements : nums) {
            if (elements == 3 || elements == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num == 2) {
                sum = sum + num;
            }
        }
        return (sum == 8);
    }

    public boolean more14(int[] nums) {
        int firstCounter = 0;
        int forthcounter = 0;

        for (int num : nums) {
            if (num == 1) {
                firstCounter++;
            }
            if (num == 4) {
                forthcounter++;
            }
        }
        return (firstCounter > forthcounter);

    }

    public int[] fizzArray(int n) {

        int[] numbers = new int[n];

        // you send numbers to the array.
        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public boolean onlyy14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4)
                return false;
        }
        return true;
    }

    public boolean no14(int[] nums) {
        boolean found1 = false;
        boolean found4 = false;

        for (int num : nums) {
            if (num == 1)
                found1 = true;

            if (num == 4)
                found4 = true;
        }
        return !found1 || !found4;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean first = false;
        boolean second = false;

        if (nums.length <= 1) return false;


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                first = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                second = true;
            }
        }

        return first != second;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && Math.abs(nums1[i] - nums2[i]) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public boolean only14(int[] numbers) {
        int counter = 0;

        for (int number : numbers) {
            if (number == 1) {
                counter++;
            }
            if (number == 4) {
                counter++;
            }
        }
        return (counter == numbers.length);
    }

    public int[] withoutTen(int[] nums) {
        int a = 0;
        int[] array = new int[nums.length];

        for (int num : nums) {
            if (num != 10) {
                array[a] = num;
                a++;
            }
        }
        return array;
    }

    public boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7)
                return true;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == 7 && nums[i + 1] == 7)
                return true;
        }
        return false;
    }

    public boolean has12(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 0 && nums[i - 1] % 2 == 0 && nums[i + 1] % 2 == 0) {
                return true;
            } else if (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0 && nums[i + 1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public int sum67(int[] nums) {
        int total = 0;
        boolean flag = true;

        for (int num : nums) {

            if (num == 6) {
                flag = false;
            }
            if (flag) {
                total += num;
            }

            if (num == 7) flag = true;
        }
        return total;
    }

    public int[] pre4(int[] nums) {
        int total = 0;

        for (int num : nums) {
            if (num != 4) {
                total++;
            } else break;
        }
        int[] array = new int[total];

        for (int i = 0; i < array.length; i++) {
            array[i] = nums[i];
        }
        return array;
    }


    // for shifting to the right.
    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;

        int[] array = new int[nums.length];
        for (int i = 1, a = 0; i < nums.length; i++) {
            array[a] = nums[i];
            a++;
        }
        array[array.length - 1] = nums[0];
        return array;

    }

    public String[] fizzArray2(int n) {
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }


    public boolean tripleUp(int[] nums) {

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && Math.abs(nums[i] - nums[i - 1]) == 1
                    && nums[i] < nums[i + 1] && Math.abs(nums[i] - nums[i + 1]) == 1) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int size = end - start;
        int[] array = new int[size];

        for (int i = start, a = 0; i < end; i++) {
            array[a] = i;
            a++;
        }
        return array;
    }

    public int[] post4(int[] nums) {
        int last4 = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4) last4 = i;

        int[] res = new int[nums.length - (last4 + 1)];
        for (int i = last4 + 1, j = 0; i < nums.length; i++, j++)
            res[j] = nums[i];

        return res;

    }

    public int[] ascendingOrder(int[] nums) {

        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;
    }


    public int centeredAverage(int[] nums) {
        int total = 0;

        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }

        for (int i = 1; i < nums.length - 1; i++) {
            total = total + nums[i];
        }

        return total / nums.length - 2;


    }


    public int[] zeroFront(int[] nums) {

        int total = 0;
        int newNumber = 0;

        for (int num : nums) {
            if (num != 0) {
                newNumber = num;
                total++;
            }
        }
        int[] array = new int[nums.length];

        for (int i = 1; i < total + 1; i++) {
            array[array.length - i] = newNumber;
        }
        return array;
    }


    public String[] fizzBuzz(int start, int end) {
        String[] array = new String[end];

        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                array[i] = "Fizz";
            }
            if (i % 5 == 0) {
                array[i] = "Buzz";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (i % 3 != 0 && i % 5 != 0) {
                array[i] = String.valueOf(i);
            }
        }
        return Arrays.copyOfRange(array, start, array.length);
    }

    public int[] notAlone(int[] numbers, int val) {
        boolean checker = false;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == val && numbers[i - 1] != val && numbers[i + 1] != val) {
                if (numbers[i] < numbers[i - 1] && numbers[i] < numbers[i + 1]) {
                    numbers[i] = Math.max(numbers[i - 1], numbers[i + 1]);
                    checker = true;
                }
                if (numbers[i] > numbers[i - 1] && numbers[i] < numbers[i + 1]) {
                    numbers[i] = numbers[i + 1];
                } else if (!checker)
                    numbers[i] = numbers[i - 1];
            }
        }
        return numbers;
    }


    public int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] != 0 && nums[i + 1] % 2 != 0) {
                nums[i] = nums[i + 1];
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {

        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] % 2 != 0 && nums[i + 1] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;

    }





}















