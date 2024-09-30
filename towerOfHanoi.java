package Recursion_repeat;

public class towerOfHanoi {
    public static void towerOfHanoi1(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return ;
        }
        towerOfHanoi1(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        towerOfHanoi1(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        towerOfHanoi1(2,"S", "H", "D");
        
    }
    
}
