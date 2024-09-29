package Recursion_repeat;

public class sumOfArray {
    public static int sumOfAnArray(int[] arr,int idx){
        int n=arr.length;
        if(idx==n){
            return 0; 
        }
        return arr[idx]+sumOfAnArray(arr, idx+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sumOfAnArray(arr, 0));
        
    }
    
}
