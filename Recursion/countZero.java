/*Number of zeroes in the integer
 * 
 * I/P1: 0
 * O/P1: 1
 * 
 * I/P2: 708000
 * O/P2: 4
 */


public class countZero {
    public static int check(int input, int count){
        //BC
        if(input/10 == 0){
            if(input==0) return count + 1;
            else return count;
        }

        //MC
        if(input%10 == 0) count = count + 1;

        //RC
        return check(input/10, count);
    }

    public static void main(String[] args) {
        System.out.println(check(708000000, 0));
    }
}

//we cant apply just //BC : if(input==0) return count; ->>> Since there migth be a case for 0(I/P1). That's why we have to take care of 0 respectively.
