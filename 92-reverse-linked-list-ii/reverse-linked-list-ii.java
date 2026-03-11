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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(left==1)
        {
            ListNode curr=head;
            ListNode prev=null;
            int ct=1;

            while(curr!=null&&ct<=right)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                ct++;
            }

            head.next=curr;
            return prev;
        }
        ListNode st=head;
        ListNode end=null;
        ListNode rev=null;
        ListNode s=null;
        int ct=1;
        if(head==null||head.next==null)
        {
            return head;
        }
        while(ct<left-1)
        {
            st=st.next;
            ct++;
        }
        rev=st.next;
        end=rev;
        ct=left;
        while(ct<right)
        {
            end=end.next;
            ct++;
        }
        s=end.next;
        end.next=null;
        ListNode curr=rev;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        st.next=prev;
        rev.next=s;

        return head;
    }
}