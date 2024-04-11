import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n");
        int n=sc.nextInt();
        int res=calculateFactorial(n);
        System.out.println("Factorial of n is "+res);
    }
    static int calculateFactorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*calculateFactorial(n-1);
        }
    }
}
