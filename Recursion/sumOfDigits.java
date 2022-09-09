import java.util.Scanner;

public class sumOfDigits {
    public static int sum(int input){
        //BC
        if(input == 0) return 0;

        return input%10 + sum(input/10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(sum(input));
        scan.close();
    }
}
