public class DoubleLL {

    // Variables
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoubleLL() {
        this.size = 0;
    }

    // Add at start of the list
    public void addFirst(int value) {
        Node node = new Node(value);
        if(size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    // Add at end of the list
    public void addLast(int value) {
        Node node = new Node(value);
        if(size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    //Add at given index
    public void addAtIndex(int value, int index) {
        Node node = new Node(value);
        if(index == 0) {
            addFirst(value);
            return;
        }
        if(index >= size) {
            if (index > size) {
                System.out.println("Item will be added to the end of the list as given index is Out of bound");
            }
            addLast(value);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }

    //remove at start of list
    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    //remove at end of list
    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    //remove at given index
    public void removeAtIndex(int index) {
        if(index == 0) {
            removeFirst();
            return;
        }
        if(index >= size) {
            if (index > size) {
                System.out.println("Item will be removed from the end of the list as given index is Out of bound");
            }
            removeLast();
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    //display the list
    public void display() {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    //size of the list
    public int size() {
        return size;
    }

    // Node for the LinkedList
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
