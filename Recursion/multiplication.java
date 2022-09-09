import java.util.Scanner;

/*Multiplication of 2 numbers with recursion
 * 
 * I/P: 3 5
 * O/P: 15
 * 
 * I/P: 4
 * 0
 * O/P: 0
 */

public class multiplication {
    public static int solution(int n, int m){
        //BC
        if(m==0) return 0;

        return n + solution(n, m-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(solution(n, m));
        scan.close();
    }
}
