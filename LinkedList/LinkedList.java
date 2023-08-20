public class LinkedList {

    // Variables
   private Node head;
   private Node tail;
   private int size;

   // Constructor
   public LinkedList() {
      this.size = 0;
   }

   //insert a new node at the Start of the list
   public void addFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;
    //if it the first element adding into the list
    if(tail == null) {
        tail = head;
    }
    size++;
   }

   //insert a new node at the End of the list
   public void addLast(int value) {
    Node node = new Node(value);
   //checking if it the first element adding into the list
    if(head == null) { 
        head = node;
        tail = node;
    } else {
        tail.next = node;
        tail = node;
    }
    size++;
   }

   //insert a new node at given index of the list
   public void insert(int value, int index) {
    Node temp = head;
    int i = 0;
    if(index == 0) {
        addFirst(value);
        return;
    }
    if(index == size) {
        addLast(value);
        return;
    }
    while(i < index - 1) {
        temp = temp.next;
        i++;
    }
    Node node = new Node(value, temp.next);
    temp.next = node;
    size++;
   }

   //display the list
   public void display() {
    Node temp = head;
    while(temp!= null) {
        System.out.print(temp.value + " --> ");
        temp = temp.next;
    }
    System.out.println("END");
   }

   //get the size of the list
   public int size() {
    return size;
   }

    //Node for the LinkedList
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
