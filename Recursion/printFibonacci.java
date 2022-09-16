import java.util.Scanner;

public class printFibonacci{
    static Scanner scan = new Scanner(System.in);
    
    public static int value(int n){
        //BASE CASE
        if(n==0 || n==1) return n;

        return value(n-1) + value(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of digits required from the series: ");
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            System.out.print(value(i) + " ");
        }
    }
}

//Note: Recursive Function for Fibonacci is : f(n) = f(n-1) + f(n-2).
// And Base Case would be n==0 and n==1 always.