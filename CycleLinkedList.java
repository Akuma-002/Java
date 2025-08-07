public class CycleLinkedList {
    public static void main(String []args){
        Node ss = new Node();
        ss.insert(2);
        ss.insert(3);
        ss.insert(4);
        ss.insert(5);
        ss.display();
        ss.Head.next.next.next.next = ss.Head.next;
        System.out.println(Node.isCycle());
        ss.cycleRemover();
        ss.cycleRemover();
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
    public Node(){}
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
            Tail = newNode;
            
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

    public static boolean isCycle(){
        Node slow = Head;
        Node fast = Head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void cycleRemover(){
        Node slow = Head;
        Node fast = Head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                slow = Head;
                Node pre = fast;
                while (slow != fast){
                    pre = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                pre.next = null;
            }
        }
        if(flag){
            System.out.println("Cycle removed");
        }
        else{
            System.out.println("Not Cycle");
        }
    }
    
}
