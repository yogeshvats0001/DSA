import java.util.ArrayList;
import java.util.Scanner;

public class pallindromeLL {
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

    public static boolean checkPallindrome(LinkedNode<Integer> head){
        //if empty
        if(head == null || head.next == null) return true;

        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }

        for(int i=0; i<list.size()/2; i++){
            if(list.get(i) != list.get(list.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        boolean result = checkPallindrome(head);
        if(result) System.out.println("Pallindrome");
        else System.out.println("Nops");
    }
    
}
