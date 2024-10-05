import java.util.Stack;
import java.util.Scanner;
public class Question_2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Any String of Parenthesis :- ");
        String str=in.next();
        in.close();
        Stack<Character> stack = new Stack<>();
        boolean ans=true;
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }
            if(ch==']' && !stack.empty()){
                if(stack.peek()=='['){
                    stack.pop();
                }else{
                    ans=false;
                    break;
                }
            }else if(ch=='}' && !stack.empty()){
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    ans=false;
                    break;
                }
            }else if(ch==')' && !stack.empty()){
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    ans=false;
                    break;
                }
            }
        }
        if(!stack.empty()){
            ans=false;
        }
        if(ans==true){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}