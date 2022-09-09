import java.util.Scanner;

public class geometricSum {
    public static double solve(int k){
        //BC
        if(k==0) return 1;

        return 1/(Math.pow(2, k)) + solve(k-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        System.out.println(solve(k));
        scan.close();
    }
}
