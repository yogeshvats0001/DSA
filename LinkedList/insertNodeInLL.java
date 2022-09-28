
import java.util.Scanner;

public class insertNodeInLL {
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

    public static LinkedNode<Integer> insert(LinkedNode<Integer> head, int index, int data){
        LinkedNode<Integer> tail = head;
        LinkedNode<Integer> newNode = new LinkedNode<Integer>(data);
        //if node has to be at index=0
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        //if node has to be added other than index=0
        int count = 0;
        while(index < count-1){
            tail = tail.next;
            count++;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        System.out.println("Enter the index: ");
        int index = scan.nextInt();
        System.out.println("Enter the value: ");
        int data = scan.nextInt();
        head = insert(head, index, data);
        print(head);
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
