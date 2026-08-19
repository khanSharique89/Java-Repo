import java.util.*;
public class prefixSum{
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int [] prefixSumArray(int [] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.print("Enter "+n+ " Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        prefixSumArray(arr);
        System.out.println("\n5Prefix Sum Array");
        printArray(arr);
    }

}
