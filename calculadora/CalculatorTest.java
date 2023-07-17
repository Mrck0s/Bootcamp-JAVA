

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.setOperatorOne(10.5);
    c.setOperation("+");
    c.setOperatorTwo(5.2);
    c.performOperation();
    System.out.println(c.getResult());
  }
}
