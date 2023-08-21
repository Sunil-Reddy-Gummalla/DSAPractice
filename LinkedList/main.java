class Main {
    public  static void main(String args[]) {
        PractiseLL list = new PractiseLL();
        list.addFirst(10);
        list.addFirst(40);
        list.addFirst(30);
        list.addLast(20);
        list.display();
        list.insertRec(77, 0); 
        list.display();  
        System.out.println(list.size());
    } 
}