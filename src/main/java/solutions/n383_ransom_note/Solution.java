package solutions.n383_ransom_note;

/**
 * @author : Sobornov Vladimir
 * @since : 09.11.2022
 **/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine)) {
            return true;
        } else {
            StringBuilder strBuilder = new StringBuilder(ransomNote);
            char[] magazineArray = magazine.toCharArray();
            int i = magazineArray.length - 1;

            while (i >= 0 && !strBuilder.isEmpty()) {
                char c = magazineArray[i];
                int index = strBuilder.indexOf(String.valueOf(c));
                if (index != -1) {
                    strBuilder.deleteCharAt(index);

                }
                if (strBuilder.isEmpty()) {
                    return true;
                }
                i--;
            }
            return false;
        }
    }
}
