/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//LOGIC    /*slow and fast--> when slow in mid and fast at end, reverse right side-->       rev(slow)-->traverse--> if(fast != slow) false */


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
              // This brings us to mid of LL
        }
        slow = rev(slow);
        fast = head;
        
        while(slow != null){
            
            if(slow.val != fast.val){
                return false;
            } 
            
            fast = fast.next;
            slow = slow.next;
        }
        return true;
        
    }
    
    public ListNode rev(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}