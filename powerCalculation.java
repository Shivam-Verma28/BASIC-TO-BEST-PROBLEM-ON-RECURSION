package Recursion_repeat;

public class powerCalculation {
    public static int powCalculation(int n,int x){
        if(x==0){
            return 1;
        }
        return n*powCalculation(n, x-1);
    }
    public static void main(String[] args) {
        
       
        System.out.println( powCalculation(2, 4));
    }
    
}
