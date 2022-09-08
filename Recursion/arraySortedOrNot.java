public class arraySortedOrNot {
    public static boolean solution(int[] arr, int start, int end){
        //BC
        if(end == arr.length) return true;

        //MC
        if(arr[start] > arr[end]) return false;

        //RC
        return solution(arr, start+1, end+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4};
        System.out.println(solution(arr, 0,1));
    }
}
