package solutions.maximum_69_number;


/**
 * @author : Sobornov Vladimir
 * @since : 07.11.2022
 **/
class Solution {
    public int maximum69Number (int num) {
        String strNumber = Integer.toString(num);
        strNumber = strNumber.replaceFirst("6", "9");
        return Integer.parseInt(strNumber);
    }
}
