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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null||head.next==null||k==0)
        return head;
        int ct=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            ct++;
            temp=temp.next;
        }
        ListNode tail=temp;
        k=k%ct;
        if(k==0) return head;
        int dif=ct-k;
        temp=head;
        for (int i=1;i<dif;i++)
        {
            temp=temp.next;
        }

        ListNode newHead=temp.next;
        temp.next=null;
        tail.next=head;

        return newHead;
    }
}