public class ListTester {
  public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(2);
        sll.add(5);
        sll.add(2);
        sll.add(15);
        sll.remove();
        sll.printValues();
        /* sll.find(2); */
        System.out.println("--------------------------------");
        sll.removeAt(5);
        sll.printValues();
    }
}

