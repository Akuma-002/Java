public class Linkedlist {
    
    public static void main(String args[]){
        Node ss = new Node();
        ss.insert(4);
        ss.insert(5);
        ss.insert(6);
        ss.inserAtStart(2);
        ss.insertAtIndex(0, 2);
        ss.insert(4);
        ss.insert(5);
        ss.insert(6);
        ss.inserAtStart(2);
        ss.display();
        ss.zigZag();
        ss.display();
    }
}



//Nodes
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
    //Insert At Start
    public void inserAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = Head;
        Head = newNode;
    }
    //Insert At Index
    public void insertAtIndex(int data, int index){
        Node newNode = new Node(data);
        Node temp = Head;
        for (int i = 0; i < index-1; i++){
            temp= temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //Display
    public void display(){
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //Display any specific index
    public void displayIndex(int index){
        Node temp = Head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        System.err.println(temp.data);
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
    //Delete at index
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
    //Delete by value
    public int deleteByValue(int n){
        Node temp = Head;
        while (temp.next != null){
            if(temp.next.data == n){
                int data = temp.next.data;
                temp.next = temp.next.next;
                return data;
            }
            else if (temp.data == n){
                int data = Head.data;
                Head = Head.next;
                return data;
            }
            temp = temp.next;
        }
        return -1;
    }
    void zigZag(){
        Node temp = Head;
        Node last = Head;
        while (temp != null){
            while(last.next.next != null){
                last = last.next;
            }
            if(temp == last.next.next){
                return;
            }
            else if (temp.next == null){
                return;
            }
            else if (temp.next.next == null){
                return;
            }
            Node te = temp.next;
            temp.next = last.next;
            last.next.next = te;
            last.next = null;
            if(temp.next == null){
                temp = temp.next;
                return;
            }
            temp = temp.next.next;
            last = Head;
        }
    }
}