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
    public void reorderList(ListNode head)
    {
        ListNode temp=head;
        ListNode temp1=head;
        int ct=0;
        while(temp!=null)
        {
            ct++;
            temp=temp.next;
        }
        int step=ct;
        if(step%2==1)
        {
            step=step-1;
            step=step/2;
        }
        else
        {
            step=(step/2)-1;
        }
        temp=head;
        for(int i=0;i<step;i++)
        {
            while(temp1.next.next!=null)
            {
                temp1=temp1.next;
            }
            temp1.next.next=temp.next;
            temp.next=temp1.next;
            temp1.next=null;
            temp=temp.next.next;
            temp1=head;
        }
    }
}