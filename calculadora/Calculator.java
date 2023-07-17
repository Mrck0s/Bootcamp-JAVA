

public class Calculator {
  private Double result;
  private Double operandOne;
  private Double operandTwo;
  private String operation;

  public Calculator() {
    result = 0.0;
  }

  public Double setOperatorOne(Double num) {
    operandOne = num;
    return operandOne;
  }

  public Double setOperatorTwo(Double num) {
    operandTwo = num;
    return operandTwo;
  }
  public void setOperation(String op) {
    operation = op;
  }
  public void performOperation() {
    if (operation == "+") {
      result = operandOne + operandTwo;
    } else if (operation == "-") {
      result = operandOne - operandTwo;
    }
  }

  public Double getResult() {
    return result;
  }
}
