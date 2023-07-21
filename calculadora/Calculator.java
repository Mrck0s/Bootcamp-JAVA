

public abstract class Calculator implements CalculatorInter {
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
  public Double getResult() {
    return result;
  }
}
