package Recursion_repeat;

public class sumOfDigit {
    public static int sumOfDigit1(int number){
        if(number==0){
            
            return 0;
        }
        return number%10 +sumOfDigit1(number/10);
        //remove the last digit of a number by taking " % "and again call the function 
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit1(5012));
    }
    
}
