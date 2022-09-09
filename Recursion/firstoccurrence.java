
public class firstoccurrence {
    public static int solution(int[] arr, int target, int index){
        //BC
        if(index == arr.length) return -1;

        //MC
        if(arr[index] == target) return index;

        //RC
        return solution(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,8};
        int target = 8;
        int index = 0;
        System.out.println(solution(arr, target, index));
    }
}
