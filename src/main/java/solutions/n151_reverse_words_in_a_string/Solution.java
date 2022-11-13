package solutions.n151_reverse_words_in_a_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author : Sobornov Vladimir
 * @since : 13.11.2022
 **/
class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        ArrayList<String> res = new ArrayList<>(str.length);

        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].equals("")) {
                res.add(str[i]);
            }
        }
        return res.stream().collect(Collectors.joining(" "));
    }
}
