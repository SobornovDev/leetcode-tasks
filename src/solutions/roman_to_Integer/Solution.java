package solutions.roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/*
 * Roman to Integer
 */

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int result = 0;

        if (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                char rimNumber = s.charAt(i);
                int number = dict.get(rimNumber);
                if (i != 0) {
                    int prevNumber = dict.get(s.charAt(i - 1));
                    if (number > prevNumber) {
                        result = result + number - 2 * prevNumber;
                    } else {
                        result += number;
                    }
                } else {
                    result += number;
                }
            }
        }
        return result;
    }
}