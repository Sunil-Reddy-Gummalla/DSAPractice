public class PractiseLL extends LinkedList {
    public PractiseLL() {
        super();
    }

    public void insertRec(int value, int index) {
        if (index == 0) {
            addFirst(value);
        } else {
            Node node = new Node(value);
            RecInsert(index, node, head);
        }

    }

    private void RecInsert(int index, Node node, Node temp) {
        if (index == 0) {
            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            RecInsert(index - 1, node, temp.next);
        }
    }

}