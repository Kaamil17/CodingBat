package sample;

public class Recursion {

    public int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies >= 1) {
            return bunnies * 2;
        } else {
            return 0;
        }
    }

    public int fibonacci(int number) {
        if (number == 0) return 0;
        if (number >= 3) {
            return fibonacci(number - 1) + fibonacci(number - 2);
        } else {
            return 1;
        }
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies >= 1) {
            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        }
        return 0;
    }

    public static int sumDigits(int number) {
        // % always gives the last number in the digit
        // but for / you still need to call the method to do it again 12345/ 10 -> 1234 so for that
        // we again need to call the method.

        if (number == 0) return 0;

        return number % 10 + sumDigits(number / 10);
    }

    public static int count7(int number) {
        int counter = 0;

        if (number % 10 == 7) counter++;
        if (number / 10 == 0) return counter;

        return counter + count7(number / 10);
    }

    public int powerN(int base, int n) {

        if (n > 0) {
            return (int) Math.pow(base, n);
        } else {
            return 0;
        }

    }

    public static int powerNumber(int base, int n) {
        if (n <= 1)
            return base;

        return base * powerNumber(base, n - 1);
    }

    public static int countX(String str) {
        if(str.length() == 0)
            return 0;

        if(str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));

        return countX(str.substring(1));
    }

}
