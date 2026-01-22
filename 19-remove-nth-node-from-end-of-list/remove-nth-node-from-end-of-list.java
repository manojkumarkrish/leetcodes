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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int pos=0;
      ListNode temp=head;
      while(temp!=null)
      {
        temp=temp.next;
        pos++;
      }
      if(n==pos)
      {
        return head.next;
      }
      int tp=0;
      temp=head;
      while(temp!=null)
      {
        if(tp==pos-n-1)
        {
            if(temp.next!=null)
            {
            temp.next=temp.next.next;
            }
            break;
        }
        temp=temp.next;
        tp++;
      }
      return head;
    }
}