public class fiboSeries {
    public static int solution(int n){
        //BC
        if((n==0) || (n==1)) return n;

        return solution(n-1) + solution(n-2);
    }


    public static void main(String[] args) {
        System.out.println(solution(3));    
    }
}
