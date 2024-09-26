package recursion;
public class factorial {
    public static int factorialOfNumber(int n){
        //base case when n==0 or n==1 it will return 1
        if(n==0||n==1){
            return 1;
        }
        //recursive call to calculate the value of given number
        return n*factorialOfNumber(n-1);
    }
    public static void main(String[] args) {
       int ans= factorialOfNumber(5);
       System.out.println(ans);
        
    }
}
