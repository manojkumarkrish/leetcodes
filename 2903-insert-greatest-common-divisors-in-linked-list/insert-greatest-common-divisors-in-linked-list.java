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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode temp=head;
        while(temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int gcd=1;
            for(int i=1;i<=a&&i<=b;i++)
            {
                if(a%i==0&&b%i==0)
                {
                    gcd=i;
                }
            }
            ListNode newnode=new ListNode(gcd);
            ListNode nextnode=temp.next;
            temp.next=newnode;
            newnode.next=nextnode;
            temp=nextnode;
        }
        return head;
    }
}