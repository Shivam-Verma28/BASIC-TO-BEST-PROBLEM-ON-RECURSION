package Recursion_repeat;

public class revString {
    public static void revOfString(String str,int idx){
        int n=str.length()-1;
        if(idx==n){
            System.out.print(str.charAt(idx));
            return;
        }
        revOfString(str, idx+1);
        System.out.print(str.charAt(idx));
    }
    public static void main(String[] args) {
        revOfString("abcdefg", 0);
        
    }
    
}
