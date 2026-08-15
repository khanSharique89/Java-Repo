import java.util.*;
public class DecimalToBinary{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal Number");
        int ans=0,pw=1;
        int decimal_num=sc.nextInt();
        while(decimal_num>0){
            int parity=decimal_num%2;
            ans+=(parity*pw);
            pw*=10;
            decimal_num/=2;
        }
        System.out.println(ans);
    }
}