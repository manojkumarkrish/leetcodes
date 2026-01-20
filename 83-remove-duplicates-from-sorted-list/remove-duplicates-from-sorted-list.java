class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
     ListNode temp=head;
     if (head == null) return null;
     while(temp.next!=null&&temp!=null)
     {
        if(temp.val==temp.next.val)
        {
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
        }
     }
     return head;
    }
}