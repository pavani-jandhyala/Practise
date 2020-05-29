package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
     static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    static void printList(Node head){
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    static Node removeDuplicates(Node head){
         Node previous=null;
         Node current=head;
        Set<Integer> set=new HashSet<>();
        while(current!=null){
            if(set.contains(current.data)){
                previous.next=current.next; // ignoring
            }
            else{
                set.add(current.data);//insert current node
                previous=current; // proceed to next node
            }
            current=previous.next;// proceed to next node
        }

        return head;
    }
    public static void main(String[] args){
         int[] keys={5,3,4,2,5,4,1,3};
         Node head = null;
         for(int i=keys.length-1;i>=0;i--){
             head=new Node(keys[i],head);
         }
         removeDuplicates(head);
         printList(head);
    }

}
