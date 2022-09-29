import java.util.Scanner;

public class findNodePositionLL {
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

    //Method1. Iterative way
    public static int position(LinkedNode<Integer> head, int value){
        int count = 0;
        while(head != null){
            if(head.data == value){
                return count;
            }
            head = head.next;
            count++;
        }
        return -1;
    }

    //Method2. Recursive Way
    public static int positionRecursion(LinkedNode<Integer> head, int value, int count){
        //BC
        if(head == null) return -1;

        //MC
        if(head.data == value) return count;

        //RC
        return positionRecursion(head.next, value, count+1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        System.out.println("Enter the value of node which you want to search: ");
        int value = scan.nextInt();
        System.out.println("Position of "+value+" is at : " + position(head, value));
        System.out.println("Position of "+value+" is at : " + positionRecursion(head, value,0));
    }
    
}
