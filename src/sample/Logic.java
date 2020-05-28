package sample;

import java.awt.event.MouseAdapter;

public class Logic {

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else
            return 1;
    }

    public int maxMod5(int a, int b) {
        if (a == b) return 0;

        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) return 10;

        if (a == b && b == c) return 5;

        if (b != a && a != c) return 1;
        return 0;
    }


    public int greenTicket(int a, int b, int c) {

        if (b != a && a != c && c != b) {
            return 0;
        } else if (a == b && b == c) {
            return 20;
        }
        return 10;
    }


    public int blueTicket(int a, int b, int c) {
        int firstPair = a + b;
        int secPair = b + c;
        int thirdPair = a + c;
        if (firstPair == 10 || secPair == 10 || thirdPair == 10) {
            return 10;
        } else if (firstPair - secPair == 10 || firstPair - thirdPair == 10) {
            return 5;
        }
        return 0;

    }


    public boolean shareDigit(int a, int b) {
        int leftA = a / 10;
        int rightA = a % 10;

        int leftB = b / 10;
        int rightB = b % 10;

        if (leftA == leftB || leftA == rightB) {
            return true;
        } else return rightA == leftB || rightA == rightB;
    }


    public String fizzString(String str) {

        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "fizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && c > b) {
            return true;
        } else return b > a && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if (a == b && b < c) {
                return true;
            } else if (b == c && a < c) {
                return true;
            } else return a == b && b == c;

        } else return a < b && b < c;
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles) {
            if (die1 == 6) {
                return (die1 + 1);
            } else if (die1 == die2) {
                return (die1 + 1) + die2;
            }
        }
        return die1 + die2;
    }











    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer) {
            return temp >= 60 && temp <= 90;
        } else {
            return temp >= 60 && temp <= 100;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed >= 61 && speed <= 80) {
                return 1;
            }
            if (speed <= 60) {
                return 0;
            }
            if (speed >= 81) {
                return 2;
            }

        } else {
            if (speed >= 66 && speed <= 85) {
                return 1;
            }
            if (speed <= 65) {
                return 0;
            }
            if (speed >= 86) {
                return 2;
            }
        }
        return 0;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        return Math.abs(a - b) == 6 || a + b == 6;
    }

    public boolean specialEleven(int n) {
        int number = n % 11;
        int qoutent = n / 11;
        return number == 0 || Math.abs(qoutent * 11 - n) == 1;
    }


    public boolean more20(int n) {
        int qoutent = n / 20;
        return Math.abs(qoutent * 20 - n) == 1 || Math.abs(qoutent * 20 - n) == 2;
    }


    public boolean old35(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return false;
        } else return number % 3 == 0 || number % 5 == 0;
    }

    public boolean less20(int n) {
        int quotient = n / 20;
        int newQoi = quotient + 1;
        return Math.abs(newQoi * 20 - n) == 1 || Math.abs(newQoi * 20 - n) == 2;
    }

    public boolean nearTen(int num) {
        return num % 10 < 3 || num % 10 > 7;
    }

    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) return 19;
        return a + b;
    }

    // deal with false cases first
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep && isMom && isMorning) return false;
        if (isMom && isMorning) return true;
        if (isMorning) return false;
        return !isAsleep;
    }


}
