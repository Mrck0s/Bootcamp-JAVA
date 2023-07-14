public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public SinglyLinkedList() {
  }

  public void remove() {
    if (head == null) {
      return;
    }
    if (head.next == null) {
      head = null;
      tail = null;
    } else {
      Node runner = head;
      while (runner.next.next != null) {
        runner = runner.next;
      }
      runner.next = null;
      tail = runner;
    }
    size--;
  }

  public void printValues() {
    Node current = head;
    while (current != null) {
      int valor = current.value;
      System.out.println(valor);
      current = current.next;
    }
  }

  public void find(int index) {
    Node current = head;
    while (current != null) {
      if (index == current.value) {
        System.out.println(index);
        break;
      }
      current = current.next;
    }
  }

  public void removeAt(int num){
    if (num < 0 || num >= size || head == null) {
      return;
    }

    if (num == 0) {
      head = head.next;
      if (head == null) {
        tail = null;
      }
    } else {
      Node previous = findNode(num - 1);
      Node current = previous.next;
      previous.next = current.next;
      if (current == tail) {
        tail = previous;
      }
    }
    size--;
  }

  public void add(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  private Node findNode(int index) {
    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current;
  }
}
