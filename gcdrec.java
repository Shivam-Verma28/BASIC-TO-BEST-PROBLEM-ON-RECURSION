package Recursion_repeat;

public class gcdrec {
    
    public static void gcdOfTwoNumber(int n1,int n2){
        int rem =n2%n1;
        if(rem==0){
            System.out.println(n1);
            return ;
        }   
        gcdOfTwoNumber(n2%n1,n1);     
}
    public static void main(String[] args) {
       gcdOfTwoNumber(68, 119);
      
        
        
    }
}
