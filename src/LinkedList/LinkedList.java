package LinkedList;

public class LinkedList {
    static int size=0;

    static Node head;
    static Node head1;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void sortList(Node node){
        Node current=node;
        Node next=null;
        int temp;
        while (current != null) {
            next=current.next;
            while(next!=null){
                if(current.data>next.data){
                    temp=current.data;
                    current.data=next.data;
                    next.data=temp;
                }
                next=next.next;
            }
            current=current.next;
        }
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static int getCount(Node node)
    {
        int count = 0;
        while (node != null)
        {
            count++;
            node = node.next;
        }
        return count;
    }

    static void isPalindrome(Node head){
        Node current = head;
        boolean flag = true;

        //Store the mid position of the list
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        //Finds the middle node in given singly linked list
        for(int i=1; i<mid; i++){
            current = current.next;
        }

        //Reverse the list after middle node to end
        Node revHead = reverse(current.next);

        //Compare nodes of first half and second half of list
        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        if(flag)
            System.out.println("Given singly linked list is a palindrome");
        else
            System.out.println("Given singly linked list is not a palindrome");
    }

    static Node sortedMerge(Node headA, Node headB){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while(true){
            if(headA==null){
                tail.next=headB;
                break;
            }
            if(headB==null) {
                tail.next = headA;
                break;
            }
            if(headA.data<=headB.data){
                tail.next=headA;
                headA=headA.next;
            }
            else
            {
                tail.next=headB;
                headB=headB.next;
            }
            tail=tail.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(5);

        //size = getCount(head);
        System.out.println("Given Linked list");
        list.printList(head);

        LinkedList list1 = new LinkedList();
        list1.head1 = new Node(6);
        list1.head1.next = new Node(4);
        list1.head1.next.next = new Node(15);
        list1.head1.next.next.next = new Node(10);

        list.head = sortedMerge(list.head,list1.head1);
        System.out.println("Merge Linked list");
        list.printList(head);

        //reverse
        /*head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

        //Palindrome
        isPalindrome(head);


        //sort
        list.sortList(head);
        System.out.println("Sorted list: ");
        list.printList(head);*/


    }
}
