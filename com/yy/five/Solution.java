package five;

import java.util.ArrayList;
public class Solution {
    ArrayList<Integer>ls=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       //先递归到链表最后，再逐个增加到list中
        if (listNode!=null){
            printListFromTailToHead(listNode.next);
            if(listNode!=null){
                ls.add(listNode.val);
            }
        }
        return ls;
    }

}