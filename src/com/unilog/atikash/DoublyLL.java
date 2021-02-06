package com.unilog.atikash;

public class DoublyLL<T> {
    private Node<T> head;
    private Node<T> tail;

    /*
     * Return The Size of list
     */
    public int size(){
        int count = 0;
        if(head==null)
            return count;
        else{
            Node<T> temp=head;
            count++;
            do{
                temp=temp.getNextNode();
                count++;
            }while(temp!=tail);
        }
        return count;
    }

    /*
     * Traverses the list from front
     */
    public void traverse() {
        if (head == null) {
            System.out.println("ERROR : list is empty So, Cannot perform traversal and deletion operations. Please add some elements");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNextNode();
            }
            System.out.println();

        }
    }

    /*
     * Insertion Methods for List
     */

    /*
     * Insert at First
     */
    public void insertAtFirst(T data){
        Node<T> node=new Node<T>(data);
        if(head==null){
            head=node;
            tail=node;
            node.setNextNode(null);
            node.setPreviousNode(null);
        }else{
            node.setNextNode(head);
            head.setPreviousNode(node);
            head=node;
        }

    }
    /*
     * Insert at Last
     */
    public void insertAtLast(T data){
        Node<T> node=new Node<T>(data);
        if(tail==null){
            head=node;
            tail=node;
            node.setNextNode(null);
            node.setPreviousNode(null);
        }else{
            node.setPreviousNode(tail);
            tail.setNextNode(node);
            tail=node;
        }
    }

    /*
     * Insert at an Index
     */
    public void insertAtIndex(T data, int insertIndex){
        if(insertIndex<0||insertIndex==0){
            insertAtFirst(data);
        }
        else if(insertIndex> size()||insertIndex== size()){
            insertAtLast(data);
        }else{

            Node<T> temp=head;
            Node<T> node=new Node<T>(data);
            for(int i=0;i<insertIndex-1;i++){
                temp=temp.getNextNode();
            }

            node.setNextNode(temp.getNextNode());
            temp.getNextNode().setPreviousNode(node);
            temp.setNextNode(node);
            node.setPreviousNode(temp);
        }
    }

    /*
     * Deletion methods
     */

    /*
     * Delete at a given index
     */
    public T deleteAtIndex(int delIndex){
        T data=null;
        if(delIndex>size()-1)
        {
            System.out.println("Index Out of range");;
        }
        else if(delIndex==0){
            data=head.getData();
            head=head.getNextNode();
        }
        else if(delIndex== size()-1){
            data=tail.getData();
            tail=tail.getPreviousNode();
            tail.setNextNode(null);
        }else{
            Node<T> temp=head;
            for(int i=0;i<delIndex;i++){
                temp=temp.getNextNode();
            }
            Node<T> node=temp.getNextNode();
            node.setPreviousNode(temp.getPreviousNode());
            temp.getPreviousNode().setNextNode(node);
            temp=null;
        }
        return data;
    }

    /*
     * Delete from Last
     */
    void deleteLast()
    {
        // Base case
        if (head == null ) {
            return;
        }

        // If node to be deleted is head node
        else if (head == tail) {
            head = null;
            tail = null;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        else if (tail.getPreviousNode() != null) {
            Node node = tail.getPreviousNode();
            node.setNextNode(null);
            tail = node;
        }
    }

    /*
     * Delete from First
     */
    void deleteFirst()
    {

        if (head == null ) {
            return;
        }

        else if (head == tail) {
            head = null;
            tail = null;
        }


        else if (head.getNextNode() != null) {
            Node node = head.getNextNode();
            node.setPreviousNode(null);
            head = node;

        }
    }



}
