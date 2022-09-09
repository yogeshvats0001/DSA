public class lastOccurrence {
    //WAY1. Starting our program from last onwards.
    public static int solution(int[] arr, int target, int index){
        //BC
        if(index == -1) return -1;

        //MC
        if(arr[index] == target) return index;

        //RC
        return solution(arr, target, index-1);
    }

    //WAY2. Have extra variable to store the things.(Update it if encountered with target value)
    public static int solution2(int[] arr, int target, int index, int result){
        //BC
        if(index == arr.length) return result;

        //MC
        if(arr[index] == target) result = index;

        //RC
        return solution2(arr, target, index+1, result);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,8};
        int target = 8;
        int index = arr.length-1;
        System.out.println("WAY1 : Result: "+solution(arr, target, index));
        int result = -1;
        index = 0;
        System.out.println("WAY2 : Result: "+solution2(arr,target, index, result));
    }
}
