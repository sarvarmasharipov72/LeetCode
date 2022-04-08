package Strings;

public class RomanToInteger {
    public int romanToInt(String s) {
        int last = 0;
        int sum = 0;
        for (char i : s.toCharArray()) {
            int j = getValue(i);
            if (j > last) {
                sum += j - last * 2;
            } else {
                sum += j;
            }
            last = j;
        }
        return sum;
    }
    public int getValue(char s) {
        switch (s) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
        }
        return 1;
    }
}
