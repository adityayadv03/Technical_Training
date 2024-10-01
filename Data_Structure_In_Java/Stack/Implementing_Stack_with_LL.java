//Done in the Class
import java.util.Scanner;
public class Implementing_Stack_with_LL{
    Node top;
    static class Node{
        int data;
        Node next;
    }
    Implementing_Stack_with_LL(){
        this.top=null;
    }
    public void push(int data){
        Node newNode = new Node();
        if(newNode==null){
            System.out.println("Stack Overflow . ");
        }else{
            newNode.data=data;
            newNode.next=top;
            top=newNode;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack Underflow . ");
        }else{
            top=top.next;
        }
    }
    public int peak(){
        if(top==null){
            return -1;
        }else{
            return top.data;
        }
    }
    public void display(){
        if(top==null){
            System.out.println("Stack is Empty . ");
        }else{
            Node temp=top;
            System.out.print("Stack Element are :- ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Implementing_Stack_with_LL stack=new Implementing_Stack_with_LL();
        int temp;
        do{
            System.out.println("Menu Driven Stack Operataions ");
            System.out.println("0.To Exit");
            System.out.println("1.Push Operation ");
            System.out.println("2.Pop Operation ");
            System.out.println("3.Peek Operation ");
            System.out.println("4.Display Operation ");
            System.out.print("Enter Your Choice :- ");
            temp=in.nextInt();
            if(temp==0){
                System.out.println("Thank You .");
                break;
            }else if(temp==1){
                System.out.print("Enter the Value you want to Push :- ");
                int val=in.nextInt();
                stack.push(val);
            }else if(temp==2){
                stack.pop();
            }else if(temp==3){
                if(stack.peak()!=-1){
                    System.out.println("Value at the Top is :- "+stack.peak());
                }else{
                    System.out.println("Stack is Empty");
                }
            }else if(temp==4){
                stack.display();
            }else{
                System.out.println("Wrong Choice . ");
            }
        }while(temp!=0);
        in.close();
    }
}