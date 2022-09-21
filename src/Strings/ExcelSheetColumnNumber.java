package Strings;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int s = 0, length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            s += ((int) columnTitle.charAt(i) - 64) * Math.pow(26, length - i - 1);
        }
        return s;
    }
}
