package solutions.n344_reverse_string;

/**
 * @author : Sobornov Vladimir
 * @since : 29.01.2023
 **/
class Solution {
    public void reverseString(char[] s) {
        int k = s.length - 1;
        for (int i = 0; i <= k; i++) {
            char proxy = s[i];
            s[i] = s[k];
            s[k] = proxy;
            k--;
        }
    }
}
