public class Linkedlist {
    
    public static void main(String args[]){
        Node ss = new Node();
        ss.insert(4);
        ss.insert(5);
        ss.insert(6);
        System.out.println(ss.deleteAtStart());
        ss.display();
    }
}




class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node(){

    }
    public static Node Head;
    public static Node Tail;
    /*Insert */
    public static void insert(int data){
        Node Newnode = new Node(data);
        if(Head == null){
            Head = Newnode;
        }
        else{
            Node temp = Head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = Newnode;
        }
    }
    //Display
    public static void display(){
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    //Delete at end
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
    //Delete at First
    public int deleteAtStart(){
        if (Head == null){
            return -1;
        }
        else if(Head.next == null){
            Head = null;
            return -1;
        }
        else{
            Node temp = Head.next;
            int rr = Head.data;
            Head = temp;
            return rr;
        }
    }
}