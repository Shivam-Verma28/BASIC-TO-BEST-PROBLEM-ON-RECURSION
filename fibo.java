package Recursion_repeat;

public class fibo {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);  
    }
    public static void main(String[] args) {
     int n=5;
     for(int i=0;i<=n;i++){
        System.out.println(fibonacci(i)+" ");
     }
    }
}

    

