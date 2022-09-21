/* Replace the given characters in the string
 * 
 * I/P: abacda
 * a x
 * O/P: xbxcdx
 */

import java.util.Scanner;
public class replaceCharacterString {
    static Scanner sc = new Scanner(System.in);

    public static String replace(String str, int index, String res, char find, char replacement){
        //BC
        if(index == str.length()) return res;

        //MC
        char ch = str.charAt(index);
        if(ch == find) res += replacement ;
        else res += ch;

        //RC
        return replace(str, index+1, res, find, replacement);
    }

    public static void main(String[] args) {
        String str = sc.next();
        String findStr = sc.next();
        char find = findStr.charAt(0);
        String replacementStr = sc.next();
        char replacement = replacementStr.charAt(0);
        String result = replace(str, 0, "",find, replacement);
        System.out.println(result);
    }
}
