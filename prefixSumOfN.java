import java.util.*;
public class prefixSumOfN{
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
        int[] arr=new int [n+1];
        System.out.print("Enter "+n+ " Elements");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        int[] prefixSum=prefixSumArray(arr);
        System.out.println("Enter the number of Queries q");
        int q=sc.nextInt();
        while(q-- >0){
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefixSum[r]-prefixSum[l-1];
            System.out.println("Sum: "+ans);
        }
    }

}
