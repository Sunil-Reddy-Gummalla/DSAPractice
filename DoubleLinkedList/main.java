class Main {
    public  static void main(String args[]) {
        DoubleLL list = new DoubleLL();
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();
        list.addLast(11);
        list.display();
        list.addAtIndex(10,8);
        list.display();
        list.removeFirst();
        System.out.println("Removing at First");
        list.display();
        list.removeLast();
        System.out.println("Removing at Last");
        list.display();
        list.removeAtIndex(8);
        System.out.println("Removing at index 8");
        list.display();
    } 
}