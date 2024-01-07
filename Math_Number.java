public class Math_Number {
    public static int count_Digits(int n) {
        int cnt = 0;
        while (n > 0) {
            int Last_Digit = n % 10;
            cnt++;

            n = n / 10;
        }
        System.out.println("The Count Of Digits is " + cnt);
        return cnt;
    }

    public static void ReverseNumber() {
        int n = 77892;
        int rev = 0;
        while (n > 0) {
            int l = n % 10;
            n = n / 10;
            rev = (rev * 10) + l;
        }
        System.out.println(rev);
    }

    public static void Palindrome() {
        int n = 121;
        // n=122;
        int dup = n;
        int rev = 0;
        while (n > 0) {
            int l = n % 10;
            n = n / 10;
            rev = (rev * 10) + l;

        }
        if (rev == dup) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not a Palindrome");
        }
    }

    public static void Armstrong() {
        // int n=371; Armstrong Number
        // int n=153; Armstrong Number
        int n = 35; // Not Armstrong Number
        int sum = 0;
        int dup = n;
        while (n > 0) {
            int l = n % 10;
            sum = sum + (l * l * l);
            n = n / 10;
        }
        if (sum == dup) {
            System.out.println("Number is Armstrong " + sum);
        } else {
            System.out.println("Number is not Armstrong " + sum);
        }
    }

    public static void PrintAllDivisor() {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void CheckPrime() {
        int n = 4;
        for (int i = 2; i <= n; i++) {
            if (n % 1 == 0 && n % n == 0) {
                System.out.println("Prime Number " + i);
            } else {
                System.out.println("Not Prime");
            }
        }
    }

    public static void main(String[] args) {
        // count_Digits(77896);
        // ReverseNumber();
        // Palindrome();
        // Armstrong();
        PrintAllDivisor();
        // CheckPrime();
    }
}
