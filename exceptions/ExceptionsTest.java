package exceptions;

import java.util.ArrayList;

public class ExceptionsTest {

  static class ExceptionExample extends Exception {
    public ExceptionExample(String message) {
      super(message);
    }
  }

  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("Hola Mundo");
    myList.add(48);
    myList.add("Adios Mundo");
    for (int i = 0; i < myList.size(); i++) {
      try {
        int castedValue = (int) myList.get(i);
      } catch (ClassCastException e) {
        try {
          throw new ExceptionExample("El proceso de casting falló en el index:" + i);
        } catch (Exception d) {
          System.out.println("El proceso fue un exito en el index:" + i);
        }
      }
    }

  }
}
