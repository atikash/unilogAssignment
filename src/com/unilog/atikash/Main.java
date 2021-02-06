package com.unilog.atikash;
public class Main {
    public static void main(String args[]){
        DoublyLL<Integer> dll=new DoublyLL<>();
        System.out.println("inserting 1 at first");
        dll.insertAtFirst(1);
        dll.traverse();

        System.out.println("inserting 2 at first");
        dll.insertAtFirst(2);
        dll.traverse();

        System.out.println("inserting 3 at first");
        dll.insertAtFirst(3);
        dll.traverse();

        System.out.println("inserting 4 at last");
        dll.insertAtLast(4);
        dll.traverse();

        System.out.println("size of List :"+dll.size());

        System.out.println("inserting 46 at Index 0");
        dll.insertAtIndex(46,0);
        dll.traverse();

        System.out.println("inserting 48 at Index 3");
        dll.insertAtIndex(48,3);;
        dll.traverse();

        System.out.println("Size of List at this point:"+dll.size());

        System.out.println("Removing from index 4");
        dll.deleteAtIndex(4);
        dll.traverse();

        System.out.println("deleting element at index 1");
        dll.deleteAtIndex(1);
        dll.traverse();

        System.out.println("deleting First Element");
        dll.deleteFirst();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();

        System.out.println("deleting First Element");
        dll.deleteFirst();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();

        System.out.println("deleting First Element");
        dll.deleteFirst();
        dll.traverse();

        System.out.println("deleting Last Element");
        dll.deleteLast();
        dll.traverse();


    }
}
