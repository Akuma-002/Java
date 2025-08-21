import java.util.*;
public class ReverseStack {
    public static Stack<Integer> reverseStack(Stack<Integer> s){
        Stack<Integer> t = new Stack<>();
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        return t;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Stack<Integer> st = reverseStack(s);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
