import java.util.ArrayList;

public class allOccurrenceArray {
    public static ArrayList<Integer> allIndex(int[] arr, int target, int index, ArrayList<Integer> aList){
        //BC
        if(index == arr.length) return aList;

        //MC
        if(arr[index] == target) aList.add(index);

        //RC
        return allIndex(arr, target, index+1, aList);
    }
    public static void main(String[] args) {
        int[] arr = {9,8,10,90,8,4,2,1,8,8,90,8,-8};
        int target = 8;
        int index = 0;
        ArrayList<Integer> aList = new ArrayList<>();
        aList = allIndex(arr, target, index, aList);
        System.out.println(aList);

    }
}
