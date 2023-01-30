package solutions.n344_reverse_string;

/**
 * @author : Sobornov Vladimir
 * @since : 29.01.2023
 **/
public class Solution {
    public void reverseString(char[] s) {
        int k = s.length - 1;
        for (int i = 0; i <= k; i++) {
            char proxy = s[i];
            s[i] = s[k];
            s[k] = proxy;
            k--;
        }
    }

    public String reverse(String str) {
        Reversible<String> stringReversible = (text) -> {
            StringBuilder result = new StringBuilder();
            int i;
            for (i = text.length() - 1; i >= 0; i--) {
                result.append(text.charAt(i));
            }
            return result.toString();
        };
        return stringReversible.reverse(str);
    }
}

interface Reversible<T> {
    T reverse(T str);
}
