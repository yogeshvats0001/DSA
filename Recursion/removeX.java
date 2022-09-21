import java.util.Scanner;

public class removeX {
    static Scanner sc = new Scanner(System.in);

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
        String str = sc.next();
        String result = remove(str, 0, "");
        System.out.println(result);
    }
}
