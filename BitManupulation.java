public class BitManupulation {

    public static int getIthBit(int n, int i) {
        int res = 1 << i; // one left shift by i places it means except i bit all bits are 0 in one binary
                          // format
        if ((n & res) == 0) // n && with res gives anding
            return 0;
        return 1;
    }

    public static boolean checkIthBitSetOrNot(int n, int i) {
        int res = 1 << i;
        if ((n & res) == 0) {
            System.out.println("Ith bit is not set");
            return false;
        }
        System.out.println("Ith bit is set");
        return true;
    }

    public static int setIthBit(int n, int i) {
        int res = 1 << i;
        return n | res;
    }

    public static int ClearIthBit(int n, int i) {// it means set Ith bit become 0 ..Ith bit may be 0 or 1
        int res = 1 << i;
        int takeNot = ~res;
        return n & takeNot;
    }

    public static int claerLastIthBit(int n, int i) {
        int res = ~(0) << i;
        return n & res;
    }

    public static boolean checkNoIsPowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }

    public static int countSetBit(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                cnt++;
            }
            n = n >> 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int a = 6, b = 1;
        System.out.println(a >> b); // formula for right shift a/2 to the power b

        int c = 5, d = 2;
        System.out.println(c << d); // formula for left shift c*2 to the power d

        int e = 334;
        int res = e & 1; // any number anding (&) with one if res==0 then number is even else number is
                         // odd
        if (res == 0)
            System.out.println("Even number");
        else
            System.out.println("odd number");

        System.out.println("Ith Bit is " + getIthBit(10, 3));

        System.out.println(checkIthBitSetOrNot(10, 3));

        System.out.println("After seting ith bit is setbit Your number become " + setIthBit(10, 2));

        System.out.println("After Claering Ith Bit is " + ClearIthBit(10, 1));

        System.out.println("After clear last Ith bit from number " + claerLastIthBit(15, 2));

        System.out.println(checkNoIsPowerOfTwo(32));

        System.out.println("set bit in number is " + countSetBit(15));
    }
}
