// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 */class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean addOne = false;
        ListNode resultHead = new ListNode(0);
        ListNode Result = resultHead;
        ListNode List1 = l1;
        ListNode List2 = l2;
        while(List1 != null || List2 != null){
            int sum = 0;
            if(List1 != null){
                sum += List1.val;
            }
            if(List2 != null){
                sum += List2.val;
            }
            Result.val = sum;
            Result = Result.next;
        }
        return resultHead;
    }

}