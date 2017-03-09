class LinkedList{
    
    private Node head;
    // linked List implementation
    public LinkedList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public boolean add(Object data){
        head = new Node(data, head);
        return true;
    }
    
    public Object remove(Object data){
        Node temp = head;
        head = head.next;
        return temp;
    }
    
    public void diplay(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    
    private class Node{
        Object data;
        Node next;
        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
}
