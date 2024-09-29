//Done by Own
import java.util.Scanner;
public class Deletion_In_LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Deletion_In_LL(){
        this.head=null;
    }
    public void createNode(int data){
        Node newnode=new Node(data);
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
    public void displayLL(){
        if(head==null){
            System.out.println("Linked List is Empty . ");
        }else{
            Node temp=head;
            System.out.print("Element of LL are :- ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }
    public void deleteAtStart(){
        if(head==null){
            System.out.println("Linked List is Empty , Can't perform operation . ");
        }else{
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Linked List is Empty , Can't perform operation . ");
        }else{
            Node temp=head.next,prev=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    }
    public void deleteElement(int data){
        if(head==null){
            System.out.println("Linked List is Empty , Can't perform operation . ");
        }else if(head.data==data){
            deleteAtStart();
        }else{
            Node prev=head,temp=head;
            while(temp.next!=null && temp.data!=data){
                prev=temp;
                temp=temp.next;
            }
            if(temp.data==data){
                prev.next=temp.next;
            }else if(temp.next==null){
                System.out.println(data+" is not present in Linked List . ");
            }
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Deletion_In_LL ll=new Deletion_In_LL();
        System.out.print("Enter the Number of Nodes :- ");
        int n=in.nextInt();
        int temp;
        System.out.print("Enter all the Element of LL :- ");
        for(int i=1 ; i<=n ; i++){
            temp=in.nextInt();
            ll.createNode(temp);
        }
        ll.displayLL();
        ll.deleteAtStart();
        System.out.println("Deleting value at Starting!!!");
        ll.displayLL();
        ll.deleteAtEnd();
        System.out.println("Deleting value at Ending!!!");
        ll.displayLL();
        System.out.print("Enter Any Element to delete :- ");
        temp=in.nextInt();
        ll.deleteElement(temp);
        ll.displayLL();
        in.close();
    }
}