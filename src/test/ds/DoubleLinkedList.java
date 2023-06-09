package test.ds;

class Node {
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
        next = null;
        prev = null;
    }
}

public class DoubleLinkedList {
    Node head;
    int size=0;
    DoubleLinkedList(){
        head = null;
    }
    public void add(int val){
        if(head == null){
            head = new Node(val);
        }
        Node cur = head;
        Node node = new Node(val);
        while(cur!=null){
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }
    public int remove(){
        if(head == null) throw new RuntimeException("List is Empty");
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        int val =cur.val;
        cur = null;
        size--;
        return val;
    }

    public void addAtIndex(int index,int val){
        if(index<0 || index>size) throw new RuntimeException("invalid index");
        Node tmp = new Node(val);
        if(index==0){
            if(head == null){
                head = new Node(val);
                size++;
                return;
            }
            tmp.next = head;
            head = tmp;
        }
        else if(index == size-1){
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = tmp;
            tmp.prev= cur;
        }
        else{
            Node cur = head;
            int count=0;
            while(count<index-1){
                cur = cur.next;
                count++;
            }
            Node next = null;
            if(index>1){
             next = cur.next.next;
            }else{
                next = cur.next;
            }
            cur.next = tmp;
            tmp.prev = cur;
            tmp.next = next;

        }
        size++;
    }

    public void display(){
        Node cur = head;
        System.out.println("display elements...");
        while(cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addAtIndex(0,1);
        dl.addAtIndex(1,2);
        dl.addAtIndex(0,3);
        dl.addAtIndex(1,4);
        dl.display();
    }
}
