import java.util.Scanner;

public class reversePrint {
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

    //Method1. Recursion
    public static void printReverseRecursion(LinkedNode<Integer> head){
        //BC
        if(head == null) return;

        //RC
        printReverse(head.next);

        //MC
        System.out.print(head.data + " ");
    }

    //Method2. Using Stack
    public static void printReverse(LinkedNode<Integer> head){
        //to be done later
        
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        System.out.println("Given Linked List: ");
        print(head);
        System.out.println("Reversed Linked List: ");
        printReverseRecursion(head);
        // System.out.println("Reversed Linked List: ");
        // printReverse(head);
    }
    
}
