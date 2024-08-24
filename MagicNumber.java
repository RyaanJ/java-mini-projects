public class MagicNumber {
    public static void main(String[] args) {
        // Original number, can be any number from -46,341 to 46,340
        // stepSix will always return the number 3.
        int myNumber = 200;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    
        }
}
