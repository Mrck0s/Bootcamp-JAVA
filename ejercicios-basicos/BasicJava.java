public class BasicJava {
    public static void printNumbers() {
        for (int i = 1; i <= 255; i++) {
            System.out.print(i + ", ");
        }
    }
    public static void printOddNumbers(){
      for(int i = 1; i <= 255; i++) {
        if(i % 2 == 1){
          System.out.print(i + ", ");
        }
      }
    }
    public static void printSum(){
      int sum = 0;
      for(int i = 0; i <= 255; i++){
        System.out.println("Nuevo numero: " + i + ", Suma total: " + (sum += i));
      }
    }
    public static void printArray(){
      int[] array = {1,3,5,7,9,13};
      for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
      }
    }
    public static void findMax(){
      int[] array = {-3,-5,-7,0,15,2,4,-55};
      int max = 0;
      for(int i = 0; i < array.length; i++){
        if(array[i] > max){
          max = array[i];
        }
      }
      System.out.println(max);
    }
    public static void getAvg(){
      double sum = 0;
      double[] array = {3,5,15,2,0,-10};
      for(int i = 0; i < array.length; i++){
        sum += array[i];
      }
      System.out.println("El promedio entre tus numeros es: " + (sum / array.length));
    }
    public static void oddArray(){
      int[] array = new int[128];
      int index = 0;
      for(int i = 1; i <= 255; i+=2){
          array[index] = i;
          index++;
      }
      System.out.print("[");
      for(int j = 0; j < array.length-1; j++){
        System.out.print(array[j] + ", ");
      }
      System.out.print(array[array.length-1]);
      System.out.print("]");
    }
    public static void biggerThanY(){
      int[] array = {1,3,5,7};
      int count = 0;
      int y = 3;
      for(int i = 0; i < array.length; i++){
        if(array[i] > y){
          count++;
        }
      }
      System.out.println("Hay un total de " + count + " numeros mayores a Y");
    }
    public static void squaredValues(){
      int[] array = {1,5,10,-2};
      for(int i=0; i<array.length; i++){
        array[i] = array[i]*array[i];
      }
      System.out.print("[");
      for(int j = 0; j < array.length-1; j++){
        System.out.print(array[j] + ", ");
      }
      System.out.print(array[array.length-1]);
      System.out.print("]");
    }
    public static void noNegs(){
      int[] array = {1,5,10,-2};
      for(int i=0; i<array.length; i++){
        if(array[i] < 0){
          array[i] = 0;
        }
      }
      System.out.print("[");
      for(int j = 0; j < array.length-1; j++){
        System.out.print(array[j] + ", ");
      }
      System.out.print(array[array.length-1]);
      System.out.print("]");
    }
    public static void minMaxAvg(){
      double[] array = {1,5,10,-2};
      double[] array2 = new double[3];
      double sum = 0;
      double max = array[0];
      double min = array[0];
      for(int i = 0; i < array.length; i++){
        sum += array[i];
        if(array[i] > max){
          array2[0] = array[i];
        } else if(array[i] < min){
          array2[1] = array[i];
        }
      }
      array2[2] = sum / array.length;
      System.out.print("[");
      for(int j = 0; j < array2.length; j++){
        System.out.print(array2[j] + ",");
      }
      System.out.print("]");
    }
    public static void changeValues(){
      int[] array = {1,5,10,7,-2};
      for(int i = 0; i < array.length; i++){
        if(i+1 < array.length){
          array[i] = array[i+1];
        } else{
          array[i] = 0;
        }
      }
      System.out.print("[");
      for(int j = 0; j < array.length; j++){
        System.out.print(array[j] + ",");
      }
      System.out.print("]");

    }

    public static void main(String[] args) {
        //printNumbers();
        //printOddNumbers();
        //printSum();
        //printArray();
        //findMax();
        //getAvg();
        //oddArray();
        //biggerThanY();
        //squaredValues();
        //noNegs();
        //minMaxAvg();
        changeValues();
    }
}

