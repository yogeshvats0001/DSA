public class sumOfArray {
    public static int sum(int[] arr, int index){
        //BC
        if(index == arr.length) return 0;

        return arr[index] + sum(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,9};
        System.out.println(sum(arr,0));
    }
}
