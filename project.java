class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(l1.val+l2.val);
        ListNode nodeNext=l3;
        int a=0;
        while(l1.next!=null&&l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            ListNode node=new ListNode(l1.val+l2.val);
            nodeNext.next=node;
            nodeNext=node;
        }
        if(l1.next!=null){
            while(l1.next!=null){
                l1=l1.next;
                ListNode node =new ListNode(l1.val);
                nodeNext.next=node;
                nodeNext=node;
            }
        }
        if(l2.next!=null){
            while(l2.next!=null){
                l2=l2.next;
                ListNode node =new ListNode(l2.val);
                nodeNext.next=node;
                nodeNext=node;
            }
        }
        nodeNext=l3;
        a=nodeNext.val/10;
        nodeNext.val%=10;
        while(nodeNext.next!=null){
            nodeNext=nodeNext.next;
            nodeNext.val+=a;
            a=nodeNext.val/10;
            nodeNext.val%=10;
        }
        if(a!=0){
            nodeNext.next=new ListNode(a);
        }
        return l3;
    }
}
