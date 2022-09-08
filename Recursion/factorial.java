import java.util.*;

public class factorial{

    public static int solution(int num){
        //BC
        if(num == 0) return 1;

        //MC
        // int meraResult = num;

        //RC
        // int recursiveResult = solution(num-1);
        return num * solution(num-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is required: ");
        int number = scan.nextInt();
        int result = solution(number);
        System.out.println(result);
        scan.close();
    }
}