import java.util.Scanner;

public class replacePIString {
    static Scanner sc = new Scanner(System.in);

    public static String replace(String str, int index, String res){
        //BC
        if(index == str.length()) return res;

        //MC
        char ch = str.charAt(index);
        if(ch == 'p' && str.charAt(index+1) == 'i') {
            res += "3.14";
            index = index+1;
        }else{
            res+=ch;
        }

        //RC
        return replace(str, index+1, res);
    }

    public static void main(String[] args) {
        String str = sc.next();
        String result = replace(str, 0, "");
        System.out.println(result);
    }
}
