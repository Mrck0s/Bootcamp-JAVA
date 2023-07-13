public class StringManipulatorTesting {
  public static void main(String[] args) {
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.join("    Hola     ", "     Mundo    ");
    System.out.println(str);

    StringManipulator manipulator2 = new StringManipulator();
    char letter = 'n';
    int a = manipulator2.getIndexOrNull("Coding", letter);
    int b = manipulator2.getIndexOrNull("Hola Mundo", letter);
    int c = manipulator2.getIndexOrNull("Saludar", letter);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    StringManipulator manipulator3 = new StringManipulator();
    String word = "Hola";
    String subString = "la";
    String notSubString = "mundo";
    int d = manipulator3.getIndexOrNullSub(word, subString);
    int e = manipulator3.getIndexOrNullSub(word, notSubString);
    System.out.println(d);
    System.out.println(e);

    StringManipulator manipulator4 = new StringManipulator();
    String word2 = manipulator4.joinSub("Hola", 1, 3, "mundo");
    System.out.println(word2);

  }
}
