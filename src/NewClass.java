public class NewClass {
    // Strings codingbat
    public static void main(String[] args) {

        String name = "Ehsan";
        System.out.println(name.length());
    }

    public boolean frontAgain(String str) {
        if (str.length() >= 2)
            return (str.substring(0, 2).equals(str.substring(str.length() - 2)));

        return false;
    }

    public String withoutX2(String str) {
        if (str.length() < 2) {
            return "";
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
            return str.substring(2);

        else if (str.charAt(0) == 'x')
            return str.substring(1);
        else if (str.charAt(1) == 'x')
            return str.substring(0, 1) + str.substring(2);
        return str;
    }

    public String withoutX(String str) {


        if (str.length() < 2) {
            return "";
        }

        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(str.length() - 1) == 'x') {
            return str.substring(0, str.length() - 1);
        } else
            return str;
    }

    public String lastChars(String a, String b) {

        if (a.length() > 1 && b.length() > 1) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else if (a.length() >= 1 && b.isEmpty()) {
            return a.substring(0, 1) + "@";
        } else if (b.length() >= 1 && a.isEmpty()) {
            return "@" + b.substring(b.length() - 1);
        } else if (a.length() == 1) {
            return a + b.substring(b.length() - 1);
        } else
            return "@@";

    }


    public String deFront(String str) {

        if (str.charAt(0) == 'a' && str.charAt(1) =='b') {
            return str;
        }else if (str.charAt(0) == 'a' ) {
            return str.substring(0,1) + str.substring(2);
        }
        else if (str.charAt(1) == 'b') {
            return str.substring(1);
        }
        else return str.substring(2);
    }

    public String without2(String str) {
        if (str.length() == 1) return str;

        if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2);

        return str;
    }

    public String conCat(String a, String b) {
        if (a.length() > 1 && b.length() >= 1 && a.substring(a.length() - 1).equals(b.substring(0, 1)))
            return a.substring(0, a.length() - 1) + b;

        return a + b;
    }

    public String minCat(String a, String b) {
        int firstLen = a.length();
        int secLen = b.length();
        int diff =0;

        if (firstLen > secLen) {
           diff = firstLen - secLen;
           return a.substring(diff) + b;
        }else if (secLen > firstLen) {
            diff = secLen - firstLen;
            return a + b.substring(diff) ;
        }
            return a + b;
    }



    public String extraFront(String str) {
        String result = "";
        if (str.length() <= 2)
            result = str + str + str;

        if (str.length() > 2) {
            String newString = str.substring(0, 2);
            result = newString + newString + newString;
        }
        return result;
    }


    public String nTwice(String str, int n) {
        String frontString = str.substring(0, n);
        String backString = str.substring(str.length() - n);

        return frontString + backString;
    }

    public String twoChar(String str, int index) {
        String result = "";

        if (index + 2 > str.length() || index < 0)
            return str.substring(0, 2);

        return str.substring(index, index + 2);

    }

    public String middleThree(String str) {
        if (str.length() <= 3) return str;
        int size = str.length() / 2;
        return str.substring(size - 1, size + 2);
    }


    public String makeOutWord(String out, String word) {

        String frontString = out.substring(0, 2);
        String backString = out.substring(2, 4);

        return frontString + word + backString;
    }

    public String left2(String str) {
        String movableString = str.substring(0, 2);
        String noMove = str.substring(2);

        return movableString + noMove;
    }

    public String withouEnd2(String str) {
        int lastChar = str.length() - 1;

        if (str.length() < 2) return str;
        return str.substring(1, lastChar);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String middleTwo(String str) {
        int size = str.length() / 2;
        String result = "";
        result = str.substring(size - 1, size + 1);

        return result;
    }

    public boolean endsLy(String str) {
        int lastTwoChar = str.length() - 2;

        if (str.length() < 2) return false;
        return str.substring(lastTwoChar).equals("ly");

    }


    // check for the length always .
    public String withoutXjj(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public String theEnd(String str, boolean front) {
        String result = "";
        if (front) {
            result = str.substring(0, 1);
        } else {
            result = str.substring(str.length() - 1);
        }
        return result;
    }


    public String nonStart(String a, String b) {
        String result = "";

        String firstString = a.substring(1);
        String secString = b.substring(1);

        result = firstString + secString;
        return result;

    }


    public String firstHalf(String str) {
        int size = str.length();
        return str.substring(0, size / 2);
    }

    public String comboString(String a, String b) {

        int firstSize = a.length();
        int secSize = b.length();
        String result = "";

        if (firstSize > secSize) {
            result = b + a + b;
        } else {
            result = a + b + a;
        }
        return result;

    }


    public String withoutEnd(String str) {
        int lastChar = str.length() - 1;

        return str.substring(1, lastChar);
    }


    public String firstTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 2);

    }

    public boolean hasBad(String str) {

        if (str.length() == 3)
            return str.substring(0, 3).equals("bad");
        if (str.length() >= 4)
            return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
        return false;
    }

    public String atFirst(String str) {

        if (str.length() >= 3) return str.substring(0, 2);
        if (str.length() == 2) return str;
        if (str.isEmpty()) return "@@";

        return str + "@";
    }

    public String lastTwo(String str) {
        String result = "";

        int lastChar = str.length() - 1;
        int secChar = str.length() - 2;

        if (str.length() < 2)
            return str;

        return str.substring(0, secChar) + str.charAt(lastChar) +
                str.charAt(secChar);
    }


    public String seeColor(String str) {
        String redColor = "red";
        String blueColor = "blue";
        String result = "";

        if (str.length() >= 3) {
            if (str.startsWith("red")) {
                result = redColor;
            } else if (str.startsWith("blue")) {
                result = blueColor;
            }
        }
        return result;
    }


    public String extraEnd(String str) {
        int lastChar = str.length() - 2;
        String result = "";
        String newString = str.substring(lastChar);
        for (int i = 0; i < 4; i++) {
            result = result + newString;

        }
        return result;
    }


}
