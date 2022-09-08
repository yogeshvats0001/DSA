import java.util.Scanner;

/*Print Numbers
 * i/p: 6
 * o/p: 1_2_3_4_5_6_
 */

public class printNumbers {
    public static void solution(int n){
        //BC
        if(n == 0) return;

        //RC
        solution(n-1);

        //MC
        System.out.print(n + "_");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = scan.nextInt();
        solution(num);
        scan.close();
    }
}
