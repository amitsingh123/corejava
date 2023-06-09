package test.ds.stack;

public class MinStack {
    Node head = null;

     class Node{
        private int val;
        private int min;
        private Node next;
        Node(int val,int min){
            this.val = val;
            this.min = min;
            this.next = null;
        }
    }

    public void push(int val){
        if(head == null){
            head = new Node(val,val);
        }else{
            int min = Math.min(val,head.min);
            Node temp = new Node(val,min);
            temp.next = head;
            head = temp;
        }
    }
    public void pop(){
        if(head == null) throw new RuntimeException("Stack is empty");
        head = head.next;
    }
    public int top(){
        if(head == null) throw new RuntimeException("Stack is empty");
        return head.val;
    }
    public int getMin(){
        if(head == null) throw new RuntimeException("Stack is empty");
        return head.min;
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(10);
        stack.push(5);
        stack.push(-1);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}
