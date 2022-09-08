import java.util.*;
public class sumOfN {
    public static int solution(int num){
        //BC
        if(num == 1) return 1;

        //MC
        int smallerValue = num;

        //RC
        int recursiveValue = solution(num-1);
        return smallerValue + recursiveValue;
        
        // return num + solution(num-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int number = scan.nextInt();
        int sum = solution(number);
        System.out.println(sum);
        scan.close();
    }
}

//Note: Natural Numbers starts from 1 to +infinity.
