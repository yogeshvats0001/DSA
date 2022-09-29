import java.util.Scanner;


public class reverseLL {
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

    //Method1. Iterative Way(Using 3 pointers)
    public static LinkedNode<Integer> reverse(LinkedNode<Integer> head){
        LinkedNode<Integer> curr = head, prev = null, forward = null;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    //Method2. Recursive
    public static LinkedNode<Integer> reverseRecursive(LinkedNode<Integer> head){
        //BC
        if(head.next == null) return head;

        //RC
        LinkedNode<Integer> reversedNode = reverseRecursive(head.next);
        head.next.next= head;
        head.next = null;
        return reversedNode;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        // head = reverse(head);
        // print(head);
        head = reverseRecursive(head);
        print(head);
    }
    
}
