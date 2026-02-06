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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode temp=head;
        ListNode n=null;
        ListNode mid=null;
        ListNode cont=null;
        ListNode st=null;
        while(temp!=null)
        {
            ListNode nextNode=temp.next;
            temp.next=null;
            if(temp.val<x)
            {
                if(n==null)
                {
                n=temp;
                st=temp;
                }
                else
                {
                    n.next=temp;
                    n=n.next;
                }
            }
            else
            {
                if(mid==null)
                {
                mid=temp;
                cont=temp;
                }
                else
                {
                    mid.next=temp;
                    mid=mid.next;
                }
            }
            temp=nextNode;
        }
        if(st==null)
        return cont;
        n.next=cont;
        return st;
    }
}