
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
  public static ArrayList<Integer> sumArrayAndGreaterThan10(int[] arr) {
    Integer sum = 0;
    for (Integer num : arr) {
      sum += num;
    }
    System.out.println("La suma de los elementos es: " + sum);
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    for (Integer num : arr) {
      if (num > 10) {
        newArr.add(num);
      }
    }
    return newArr;
  }
  public static ArrayList<String> biggerNames(ArrayList<String> arr) {
    Collections.shuffle(arr);
    System.out.println(arr);
    ArrayList<String> newArr = new ArrayList<String>();
    for (String name : arr) {
      if (name.length() > 5) {
        newArr.add(name);
      }
    }
    return newArr;
  }
  public static String shuffleAlphabet(ArrayList<Character> arr) {
    System.out.println(arr);
    Collections.shuffle(arr);
    System.out.println(arr);
    if(arr.get(0) == 'a' || arr.get(0) == 'e' || arr.get(0) == 'i' || arr.get(0) == 'o' || arr.get(0) == 'u'){
      System.out.println("La primer letra es una vocal!");
    }
    System.out.println("La ultima letra es: " + String.valueOf(arr.get(arr.size() - 1)));
    return "";
  }
  public static ArrayList<Integer> randomNumbers() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Random r = new Random();
    for (int i = 0; i < 10; i++) {
      arr.add(r.nextInt(46) + 55);
    }
    return arr;
  }
  public static String sortNums(ArrayList<Integer> arr) {
    Collections.sort(arr);
    System.out.println(arr);
    System.out.println("El numero menor es: " + arr.get(0));
    System.out.println("El numero mayor es: " + arr.get(arr.size() - 1));
    return "";
  }
  public static String randomString() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String randomString = "";
    Random r = new Random();
    for (int i = 0; i < 5; i++) {
      randomString += alphabet.charAt(r.nextInt(26));
    }
    return randomString;
  }
  public static void main(String[] args) {
    int[] numbers = {3,5,1,2,7,9,8,13,25,32};
    System.out.println(sumArrayAndGreaterThan10(numbers));
    ArrayList<String> names = new ArrayList<String>();
    names.add("Nancy");
    names.add("Jinichi");
    names.add("Fujibayashi");
    names.add("Momochi");
    names.add("Ishikawa");
    System.out.println(biggerNames(names));
    ArrayList<Character> alphabet = new ArrayList<Character>();
    for (char ch = 'a'; ch <= 'z'; ch++) {
      alphabet.add(ch);
    }
    System.out.println(shuffleAlphabet(alphabet));
    System.out.println(randomNumbers());
    System.out.println("");
    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
    randomNumbers = randomNumbers();
    System.out.println(sortNums(randomNumbers));
    System.out.println(randomString());
    ArrayList<String> randomsStrings = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      randomsStrings.add(randomString());
    }
    System.out.println(randomsStrings);
    
  }
}
