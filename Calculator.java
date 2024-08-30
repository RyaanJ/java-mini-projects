public class Calculator{
// Simple Calculator used to calculate arithmetic operations + modulo
    public Calculator() {
  
    }
    public int add(int a, int b) {
      return a + b;
    }
    public int subtract(int a, int b) {
      return a - b;
    }
    public int multiply(int a, int b) {
      return a * b;
    }
    public int divide(int a, int b) {
      return a / b;
    }
    public int modulo(int a, int b) {
      return a % b;
    }
    public int orderOfOperationsPratice(int a, int b, int c, int d) {
      return a + b / c * d + a - c;
    }
    
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
      int multiply = myCalculator.multiply(5, 6);
      System.out.println(multiply);
      double divide = myCalculator.divide(68, 5);
      System.out.println(divide);
      System.out.println(myCalculator.modulo(14920, 83));
      System.out.println(myCalculator.subtract(138918341, 218412412));
      System.out.println(myCalculator.orderOfOperationsPratice(12, 32, 41, 145));
    }
  }