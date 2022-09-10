public class printArray {
    public static void print(int[] arr, int index){
        //BC
        if(index == arr.length) return;

        //MC
        System.out.println(arr[index]);

        //RC
        print(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 0;
        print(arr, index);
    }
}
