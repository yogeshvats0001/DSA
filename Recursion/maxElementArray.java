public class maxElementArray {
    public static int max(int[] arr, int index, int maxi){
        //BC
        if(index == arr.length) return maxi;

        //MC
        if(arr[index] > maxi) maxi = arr[index];

        //RC
        return max(arr, index+1, maxi);
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,3,4,2,9,10,0,-70};
        int index = 0;
        // int maxi = -1;
        int maxi = Integer.MIN_VALUE;
        System.out.println(max(arr, index, maxi));
    }
}
