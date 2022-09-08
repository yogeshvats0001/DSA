import java.util.Scanner;

public class countDigits {
    public static int solution(int num){
        //BC
        if(num == 0) return 0;

        return 1 + solution(num/10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();
        int result = solution(number);
        System.out.println(result);
        scan.close();
    }
}
