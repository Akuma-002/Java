import java.util.ArrayList;
public class Stack {
    static class StackA{
        static ArrayList<Integer> list = new ArrayList();
        public static boolean isEmpty(){
            return (list.size()==0);
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public static int peek(){
            return (list.get(list.size() - 1));
        }
    }
    public static void main(String args[]){
        StackA ss = new StackA();
        ss.push(2);
        ss.push(2);
        System.out.println(ss.list);
        System.out.println(ss.isEmpty());
    }
}
