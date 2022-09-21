import java.util.Scanner;

public class removeDuplicate {
    static Scanner scan = new Scanner(System.in);

    public static String remove(String str, int index, String res){
        //BC
        if(index == str.length()) return res;

        //MC
        char ch = str.charAt(index);
        if(ch != res.charAt(res.length()-1)) res+=ch;

        //RC
        return remove(str, index+1, res);
    }

    public static void main(String[] args) {
        String str = scan.next();
        String res = "" + str.charAt(0);
        String result = remove(str, 1, res);
        System.out.println(result);
    }
}
