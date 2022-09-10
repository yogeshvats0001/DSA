public class replacePI {
    public static String change(String str, int index, String result){
        //BC
        if(index == str.length()) return result;

        //MC
        char ch = str.charAt(index);
        if(ch != 'p' && ch != 'i') result += ch;

        //RC
        return change(str, index+1, result);
    }

    public static void main(String[] args) {
        String str = "xpix";
        int index = 0;
        String result = "";
        result = change(str, index, result);
        System.out.println(result);
    }
}
