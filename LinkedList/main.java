class Main {
    public  static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(40);
        list.addFirst(30);
        list.addLast(20);
        list.insert(77, 2);   
        list.display();
        list.remove(3);
        list.display();
        System.out.println(list.size());
    } 
}