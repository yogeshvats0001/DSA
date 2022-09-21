
/* Pair Star
 * 
 * I/P:  hello
 * O/P: hel*lo
 * 
 * I/P: ssss
 * O/P: s*s*s*s
 */

import java.util.Scanner;
public class pairStar {
    static Scanner sc = new Scanner(System.in);
    public static String star(String str, int index, String res){
        //BC
        if(index == str.length()) return res;

        //MC
        char ch = str.charAt(index);
        if(ch == res.charAt(res.length()-1)){
            res+='*';
        }
        res+=ch;

        //RC
        return star(str, index+1, res);
    }

    public static void main(String[] args) {
        String str = sc.next();
        String res = ""+str.charAt(0);
        String result = star(str, 1, res);
        System.out.println(result);
    }
}
