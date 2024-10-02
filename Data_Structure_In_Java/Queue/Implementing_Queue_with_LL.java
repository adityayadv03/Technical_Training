//Done by own
import java.util.Scanner;
public class Implementing_Queue_with_LL{
    Node front,rear;
    static class Node{
        int data;
        Node next;
    }
    Implementing_Queue_with_LL(){
        this.front=null;
        this.rear=null;
    }
    public void enQueue(int data){
        Node newNode = new Node();
        if(front==null && rear==null){
            newNode.data=data;
            newNode.next=rear;
            front=newNode;
            rear=newNode;
        }else{
            newNode.data=data;
            newNode.next=null;
            rear.next=newNode;
            rear=newNode;
        }
    }
    public void deQueue(){
        if(front==null){
            System.err.println("Queue is Empty . ");
        }else{
            front=front.next;
            if(front==null){
                rear=null;
            }
        }
    }
    public int getFront(){
        if(front==null){
            System.err.println("Queue is Empty . ");
            return -1;
        }else{
            return front.data;
        }
    }
    public int getRear(){
        if(rear==null){
            System.out.println("Queue is Empty . ");
            return -1;
        }else{
            return rear.data;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is Empty . ");
        }else{
            Node temp=front;
            System.out.print("Element in the Queue are :- ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Implementing_Queue_with_LL queue = new Implementing_Queue_with_LL();
        int temp;
        do{
            System.out.println("Menu Driven Stack Operataions ");
            System.out.println("0.To Exit");
            System.out.println("1.Enqueue Operation ");
            System.out.println("2.Dequeue Operation ");
            System.out.println("3.getFront Operation ");
            System.out.println("4.getRear Operation ");
            System.out.println("5.Display Operation . ");
            System.out.print("Enter Your Choice :- ");
            temp=in.nextInt();
            if(temp==0){
                System.out.println("Thank You .");
                break;
            }else if(temp==1){
                System.out.print("Enter the Value you want to add :- ");
                int val=in.nextInt();
                queue.enQueue(val);
            }else if(temp==2){
                queue.deQueue();
            }else if(temp==3){
                if(queue.getFront()!=-1){
                    System.out.println("Value at the Front is :- "+queue.getFront());
                }
            }else if(temp==4){
                if(queue.getRear()!=-1){
                    System.out.println("Value at the Rear is :- "+queue.getRear());
                }
            }else if(temp==5){
                queue.display();
            }else{
                System.out.println("Wrong Choice . ");
            }
        }while(temp!=0);
        in.close();
    }
}