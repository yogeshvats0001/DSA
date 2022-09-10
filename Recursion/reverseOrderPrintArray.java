public class reverseOrderPrintArray {
    //WAY1. starting from last onwards
    public static void print1(int[] arr, int index){
        //BC
        if(index == -1) return;

        //MC
        System.out.println(arr[index]);

        //RC
        print1(arr, index-1);
    }

    //WAY2. Head Recursion(printing on returing from base case)
    public static void print2(int[] arr, int index){
        //BC
        if(index == arr.length) return;

        //RC
        print2(arr, index+1);

        //MC
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = arr.length - 1;
        print1(arr, index);
        
        System.out.println();
        index = 0;
        print2(arr, index);
    }
}
