
/* Remove x from the given string
 * 
 * I/P: "abxcxa"
 * O/P: "abca"
 */

import java.util.Scanner;
public class removeXInString {
    static Scanner scan = new Scanner(System.in);

    public static String remove(String str, int index, String res){
        //BC
        if(index == str.length()) return res;

        //MC
        char ch = str.charAt(index);
        if(ch != 'x' && ch != 'X') res+=ch;

        //RC
        return remove(str, index+1, res);
    }

    public static void main(String[] args) {
        String str = scan.next();
        String result = remove(str, 0, "");
        System.out.println(result);
    }
}
