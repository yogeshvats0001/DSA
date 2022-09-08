public class checkElementOrNot {
    public static boolean solve(int[] arr, int target, int index){
        //BC
        if(index == arr.length) return false;

        //MC
        if(arr[index] == target) return true;

        //RC
        return solve(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,90,2};
        int target = 80;
        System.out.println(solve(arr, target, 0));
    }
}
