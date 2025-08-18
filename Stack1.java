import java.util.ArrayList;
import java.util.Stack;
public class Stack1 {
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
    static class StackB{
        public static Node head = new Node();
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            if(isEmpty()){
                head.data = data;
            }
            else{
                head.insert(data);
            }
        }
        public static int pop(){
            return (head.deleteAtEnd());
        }
        public static int peek(){
            Node temp = head;
            while(head.next != null){
                temp = temp.next;
            }
            return temp.data;
        }
        static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            };
            public Node(){};
            public static Node Head;
            public static Node Tail;
            /*Insert At End*/
            public void insert(int data){
                Node newNode = new Node(data);
                if(Head == null){
                    Head = newNode;
                }
                else{
                    Node temp = Head;
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
            }
            
            public void display(){
                Node temp = Head;
                while(temp != null){
                    System.out.print(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println("null");
            }
            public int deleteAtIndex(int n){
                if (n == 0){
                    Node temp = Head.next;
                    int data = Head.data;
                    Head = temp;
                    return data;
                }
                Node temp = Head;
                for (int i = 0; i < n-1; i++){
                    temp = temp.next;
                }
                int data = temp.next.data;
                temp.next = temp.next.next;
                return data;
            }
            public int deleteAtEnd(){
                if (Head == null){
                    return -1;
                }
                else if(Head.next == null){
                    Head = null;
                    return -1;
                }
                else{
                    Node temp = Head;
                    while (temp.next.next != null){
                        temp = temp.next;
                    }
                    temp.next = null;
                    return temp.data;
                }
            }
        }
    }
    public static void main(String args[]){
        StackB ss = new StackB();
        ss.push(2);
        ss.push(2);
        ss.push(2);
        ss.push(2);
        ss.head.display();
        System.out.println(ss.isEmpty());
    }
}

/*Linked List */
