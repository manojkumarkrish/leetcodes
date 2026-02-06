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
class Solution 
{
    public ListNode swapPairs(ListNode head) 
    {
      ListNode temp=head;
      if(head==null||head.next==null)
      {
        return head;
      }
      ListNode prev=null;
      int ct=0;
      while(temp!=null&&temp.next!=null)
      {
        if(ct==0)
        {
            head=temp.next;
            ct++;
        }
        ListNode f=temp;
        ListNode s=temp.next;
        ListNode c=s.next;
        s.next=f;
        f.next=c;
        if(prev!=null)
        prev.next=s;
        prev=f;
        temp=c;
      }
      return head; 
    }
}