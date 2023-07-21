
import java.util.ArrayList;

public abstract class Calculator implements CalculatorInter {
  private Double result = 0.0;
  private String operation;
  private ArrayList<Object> params = new ArrayList<Object>();

  public Calculator() {
    result = 0.0;
  }
  public 
  public Double getResult() {
    return result;
  }
  public Double multiply(Double param1, Double param2){
    this.result = param1*param2;
    return result;
  }
  public Double divition(Double param1, Double param2){
    Double result = param1/param2;
    return result;
  }

  public void performOperation(){
    if(params.size() == 0){

    }
  }
}

