/* Print the ith node starting from the zero */

import java.util.Scanner;

public class ithNodeLL {
    
    static Scanner scan = new Scanner(System.in);

    public static LinkedNode<Integer> takeInput(){
        LinkedNode<Integer> head = null, tail = null;
        int data = scan.nextInt();
        while(data != -1){
            LinkedNode<Integer> newNode = new LinkedNode<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = scan.nextInt();
        }
        return head;
    }
    
    public static void print(LinkedNode<Integer> temp){
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Method1. Simple way of iterating the things of LL
    public static int find(LinkedNode<Integer> head, int target){
        int count = 0;
        while(head != null){
            if(count == target){
                return head.data;
            }
            head = head.next;
            count++;
        }
        return -1;
    }

    //Method2. Recursive way
    public static int findRecursive(LinkedNode<Integer> head, int target, int count){
        //BC
        if(head == null) return -1;

        //MC
        if(count == target) return head.data;

        //RC
        return findRecursive(head.next, target, count+1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        System.out.println("Enter the ith value: ");
        int target = scan.nextInt();
        System.out.println("Element of "+target+" th position is : "  + find(head, target));
        System.out.println("Element of "+target+" th position is : "  + findRecursive(head, target,0));
    }
}
