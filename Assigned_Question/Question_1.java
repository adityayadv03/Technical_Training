import java.util.Scanner;
public class Question_1{ //Question to print the Linked list in reverse order without reversing it
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Question_1(){
        this.head=null;
    }
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void reverseNode(Node temp){ //Logic of Printing the linked list in reverse order Using Recursion
        if(temp.next==null){
            System.out.print(temp.data+" ");
        }else{
            reverseNode(temp.next);
            System.out.print(temp.data+" ");
        }
    }
    public void displayNode(){
        if(head==null){
            System.out.println("Linked List is Empty . ");
        }else{
            Node temp=head;
            System.out.print("Element of Linked List are :- ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Question_1 ll = new Question_1();
        System.out.print("Enter the Number of Nodes :- ");
        int n=in.nextInt();
        System.out.print("Enter All the Element :- ");
        for(int i=1 ; i<=n ; i++){
            int temp=in.nextInt();
            ll.addNode(temp);
        }
        ll.displayNode();
        System.out.println();
        System.out.print("Linked List in Reverse :- ");
        ll.reverseNode(ll.head);
        in.close();
    }
}