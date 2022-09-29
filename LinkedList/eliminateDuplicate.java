import java.util.Scanner;

public class eliminateDuplicate {
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

    public static LinkedNode<Integer> check(LinkedNode<Integer> head){
        //if empty LL or single node
        if(head == null || head.next == null) return head;

        LinkedNode<Integer> node = head, uniqueNode = head.next;
        while(uniqueNode != null){
            if(uniqueNode.data != node.data){
                node.next = uniqueNode;
                node = node.next;
            }
            uniqueNode = uniqueNode.next;
        }
        node.next = null;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        head = check(head);
        print(head);
    }
    
}
