package solutions.n1047_remove_all_adjacent_duplicates_In_string;

/**
 * @author : Sobornov Vladimir
 * @since : 10.11.2022
 *
 * You are given a string s consisting of lowercase English letters.
 * A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 *
 * We repeatedly make duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.
 * It can be proven that the answer is unique.
 **/
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
