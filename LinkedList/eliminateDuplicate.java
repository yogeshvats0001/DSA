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

    public static LinkedNode<Integer> check1(LinkedNode<Integer> head){
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
        node.next = null; //for stoping the LL
        return head;
    }

    public static LinkedNode<Integer> check2(LinkedNode<Integer> head){
        //if empty or one node
        if(head == null || head.next == null) return head;

        LinkedNode<Integer> newNode = head, tail = head;
        head = head.next;
        while(head != null){
            if(tail.data != head.data){
                tail.next = head;
                tail = tail.next;
            }
            head = head.next;
        }
        tail.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        head = check2(head);
        print(head);
    }
}

//Both functions are okay, We can use Check1 or Check2
