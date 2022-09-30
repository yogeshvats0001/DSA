import java.util.*;
public class midNodeLL {
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

    public static LinkedNode<Integer> middleNode(LinkedNode<Integer> head){
        LinkedNode<Integer> fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        LinkedNode<Integer> mid = middleNode(head);
        System.out.println("Middle Node of the given LL is  : " + mid.data);
    }
    
}

class LinkedNode<T>{
    T data;
    LinkedNode<T> next;
    public LinkedNode(T data){
        this.data = data;
        next = null;
    }
}