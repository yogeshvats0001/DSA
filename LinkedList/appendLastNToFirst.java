import java.util.Scanner;

public class appendLastNToFirst {
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

    public static LinkedNode<Integer> appendN(LinkedNode<Integer> head, int N){
        //if N ==0 
        if(N==0) return head;

        LinkedNode<Integer> start = head, temp = head;
        int countStart =0, countTemp = 0;
        while(temp != null){
            if(countTemp - countStart > N){
                countStart++;
                start = start.next;
            }
            if(temp.next == null){
                break;
            }
            countTemp++;
            temp = temp.next;
        }

        temp.next = head;
        head = start.next;
        start.next = null;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements of the LL: ");
        LinkedNode<Integer> head = takeInput();
        print(head);
        System.out.println("Enter the value of N which you want to append at First: ");
        int N = scan.nextInt();
        head = appendN(head, N);
        print(head);
    }
    
}


//Good Question.