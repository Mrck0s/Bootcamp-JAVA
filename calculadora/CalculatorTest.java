

public class CalculatorTest extends Calculator {
  public static void main(String[] args) {
    CalculatorTest c = new CalculatorTest();
    c.setOperatorOne(10.5);
    c.setOperation("+");
    c.setOperatorTwo(5.2);
    c.performOperation();
    System.out.println(c.getResult());
  }
}
