import java.util.Scanner;

public class deleteNodeLL {
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

    public static LinkedNode<Integer> deleteNode(LinkedNode<Integer> head, int deletePos){
        //if deletePos is zero
        if(deletePos == 0) return head.next;

        //if not zero
        int count = 0;
        LinkedNode<Integer> temp = head;
        while(count < deletePos - 1 && temp!=null){ //temp!=null otherwise null pointer exception
            count++;
            temp = temp.next;
        }
        //if deletePos is greater than actual size of LL.
        if(temp == null || temp.next==null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        System.out.println("Enter the position which you want to delete: ");
        int deletePos = scan.nextInt();
        head = deleteNode(head, deletePos);
        print(head);
    }
    
}
