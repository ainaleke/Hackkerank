//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node nodeToInsert=new Node();
    nodeToInsert.data=data;
    if(position==0){
        nodeToInsert.next=head;
        head=nodeToInsert;
        return head;
    }
    Node current=head;
    int counter=1;
    while(counter<position){
        current=current.next;
        counter++;
    }
    Node temp=current.next;
    current.next=nodeToInsert;
    nodeToInsert.next=temp;
    
    return head;
}
