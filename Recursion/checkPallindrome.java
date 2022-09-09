import java.util.Scanner;

public class checkPallindrome {
    public static boolean check(String str, int index, int len){
        //BC
        if(index == len/2) return true;

        //MC
        if(str.charAt(index) != str.charAt(len - 1 -index)) return false;

        //RC
        return check(str, index+1, len);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(check(str,0, str.length()));
        scan.close();
    }
}
