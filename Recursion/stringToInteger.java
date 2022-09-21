public class stringToInteger {
    static int solve(String str, int index){
        //BC
        if(index == str.length()) return 0;

        //MC
        int smallerPart = (int) Math.pow(10, str.length()-1-index) * (str.charAt(index) - '0');

        //rc
        return smallerPart + solve(str, index+1);
    }
    public static void main(String[] args) {
        String str = "12345";
        int index = 0;
        int result = solve(str, index);
        System.out.println(result);
    }
}

//Good Question!
