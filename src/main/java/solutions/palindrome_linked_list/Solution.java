package solutions.palindrome_linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sobornov Vladimir
 * @since : 06.11.2022
 **/
public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        int value = head.val;
        List<Integer> list = new ArrayList<>();

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        int len = list.size() - 1;
        int start = 0;

        while (len >= 1) {
            if (list.get(start) != list.get(len)) {
                return false;
            }
            start++;
            len--;
        }
        return true;
    }


//    private ListNode frontPointer;
//
//    private boolean recursivelyCheck(ListNode currentNode) {
//        if (currentNode != null) {
//            if (!recursivelyCheck(currentNode.next)) return false;
//            if (currentNode.val != frontPointer.val) return false;
//            frontPointer = frontPointer.next;
//        }
//        return true;
//    }
//
//    public boolean isPalindrome(ListNode head) {
//        frontPointer = head;
//        return recursivelyCheck(head);
//    }
}
