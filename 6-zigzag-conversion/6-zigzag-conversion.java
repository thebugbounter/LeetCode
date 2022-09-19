public class Solution {

    public String convert(String s, int numRows) {
        // Base conditions
        if (s == null || s.isEmpty() || numRows <= 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        // Resultant string
        StringBuilder result = new StringBuilder();
        // Step size
        int step = 2 * numRows - 2;
        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            // Loop for each character in the row
            for (int j = i; j < s.length(); j += step) {
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }
        }
        return result.toString();
    }
}