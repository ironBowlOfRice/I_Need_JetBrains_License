import java.util.ArrayList;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list=new ArrayList<>();
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        while(list1.next!=null){
            list.add(list1.val);
            list1=list1.next;
        }
        list.add(list1.val);
        while(list2.next!=null){
            list.add(list2.val);
            list2=list2.next;
        }
        ListNode list3=new ListNode();
        ListNode node=new ListNode();
        list.add(list2.val);
        int b=list.size();
        for(int i=0;i<b;i++){
            int a=list.get(0);
            for(int j=1;j<list.size();j++){
                if(list.get(j)<a){
                    a=list.get(j);
                }
            }
            if(i==0){
                list3=new ListNode(a);
                node=list3;
            }else{
                ListNode nodeNext=new ListNode(a);
                node.next=nodeNext;
                node=nodeNext;
            }

            list.remove(list.indexOf(a));
        }

        return list3;
    }
}