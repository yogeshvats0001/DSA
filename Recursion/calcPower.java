import java.util.*;
public class calcPower {
    public static int solution(int n , int m){
        //BC
        if(m == 0) return 1;

        return n * solution(n, m-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n and m: ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int powerResult = solution(n,m);
        System.out.println(powerResult);
        scan.close();
    }
}
