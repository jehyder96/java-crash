public class Variables {

  public static void main(String[] args) {
    int x = multiply(7,3);
    Person myPerson = new Person("Jordan", 26);
    Person yourPerson = new Person("John Smith", 30);
    
    myPerson.age = 27; //instance variables

    System.out.println(myPerson);
    System.out.println(yourPerson);
  }
  
  public static int multiply(int a, int b){
    int result = a * b;
    printNum(result);
    return result;
  }

  public static void printNum(int numToPrint){
    System.out.println(numToPrint);
  }
}