//Done in the Class
import java.util.Scanner;
public class Insertion_In_LL{
    Node head;
    class Node{ //class to implement node
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Insertion_In_LL(){
        this.head=null;
    }
    public void createNode(int data){ //Function to create node 
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void insertAtStart(int data){ //Inserting any element at the starting of Linked List
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtEnd(int data){ //Inserting any element at the ending of Linked List
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void insertAfter(int data1,int data2){ //Inserting any element after any element in Linked List
        if(head==null){
            System.out.println("Linked List is Empty . ");
        }else{
            Node temp=head;
            while(temp!=null && temp.data!=data1){
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Element is not present in LL . ");
            }else{
                Node nextnode=temp.next;
                Node newnode = new Node(data2);
                temp.next=newnode;
                newnode.next=nextnode; 
            }
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked List is Empty . ");
        }else{
            System.out.print("Element of Linked list are :- ");
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Insertion_In_LL ll = new Insertion_In_LL();
        System.out.print("Enter number of node for LL :- ");
        int n=in.nextInt();
        int temp;
        System.out.print("Enter All the ELement you want in LL :- ");
        while(n-->0){
            temp=in.nextInt();
            ll.createNode(temp);
        }
        ll.display();
        System.out.print("Enter the Element to add at the start :- ");
        temp=in.nextInt();
        ll.insertAtStart(temp);
        ll.display();
        System.out.print("Enter the Element to add at the end :- ");
        temp=in.nextInt();
        ll.insertAtEnd(temp);
        ll.display();
        System.out.print("Enter the value to insert and value after which to insert :- ");
        temp=in.nextInt();
        int value=in.nextInt();
        ll.insertAfter(temp, value);
        ll.display();
        in.close();
    }
}