import java.util.ArrayList;

public class RecursionBasics {
    public static void print(int ind, int n) {
        if (ind == n)
            return;
        System.out.println("Anand");
        print(ind = ind + 1, n);
    }

    public static void linear(int ind, int n) {
        if (ind > n)
            return;
        System.out.println(ind);
        linear(ind + 1, n);
    }

    public static void decreaOrder(int ind, int n) {
        if (n < ind)
            return;
        System.out.println(n);
        decreaOrder(ind, n - 1);
    }

    public static void backLinear(int ind, int n) {
        if (ind < 1)
            return;
        backLinear(ind - 1, n);
        System.out.println(ind);
    }

    public static void backDecrese(int ind, int n) {
        if (ind > n)
            return;

        backDecrese(ind + 1, n);
        System.out.println(ind);
    }

    public static void sumOfNatural(int sum, int n, int i) {
        if (i > n) {
            System.out.println(sum);
            return;
        }

        sumOfNatural(sum + i, n, i + 1);

    }

    static int sum = 0;

    public static int sumOfNatural1(int i, int n) {
        if (i > n)
            return 0;
        sum += i;
        sumOfNatural1(i + 1, n);
        return sum;
    }

    public static int sumOfNatural2(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNatural2(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void reverseArray(int i, int arr[]) {
        if (i >= arr.length)
            return;
        reverseArray(i + 1, arr);
        System.out.print(arr[i] + " ");
    }

    public static boolean Palindrome(int i, String s, int n) {
        if (i >= n / 2)
            return true;
        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        return Palindrome(i + 1, s, n);
    }

    public static int fibonnaci(int n) {
        if (n <= 1)
            return n;
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    public static void printSubSequence(int arr[], ArrayList<Integer> ar, int i, int n) {
        if (i >= n) {
            System.out.println(ar);
            return;
        }
        ar.add(arr[i]);
        printSubSequence(arr, ar, i + 1, n);
        ar.remove(ar.size() - 1);
        printSubSequence(arr, ar, i + 1, n);
    }

    public static int check(ArrayList<Integer> ar) {
        int sum = 0;
        for (int x : ar)
            sum += x;
        return sum;
    }

    public static void printSubSequenceSumK(int arr[], ArrayList<Integer> ar, int i, int n, int k) {
        if (i >= n) {
            if (check(ar) == k) {
                System.out.println(ar);
                return;
            }
            return;
        }
        ar.add(arr[i]);
        printSubSequenceSumK(arr, ar, i + 1, n, k);
        ar.remove(ar.size() - 1);
        printSubSequenceSumK(arr, ar, i + 1, n, k);
    }

    public static void main(String[] args) {
        // print(0, 5);
        // linear(1, 5);
        // decreaOrder(1, 5);
        // backLinear(4, 4);
        // backDecrese(1, 5);
        // sumOfNatural(0, 10, 1);

        // int res = sumOfNatural1(1, 10);
        // System.out.println(res);

        // int res1 = sumOfNatural2(5);
        // System.out.println(res1);

        // int res2 = factorial(4);
        // System.out.println(res2);

        // int arr[] = { 1, 2, 3, 4 };
        // reverseArray(0, arr);

        // String s = "mamd";
        // int n = s.length();
        // boolean res3 = Palindrome(0, s, n);
        // System.out.println(res3);

        // int res4 = fibonnaci(7);
        // System.out.println(res4);

        // int arr[] = { 1, 2, 3 };
        // ArrayList<Integer> ar = new ArrayList<>();
        // printSubSequence(arr, ar, 0, arr.length);

        int arr[] = { 1, 2, 1 };
        ArrayList<Integer> ar = new ArrayList<>();
        printSubSequenceSumK(arr, ar, 0, arr.length, 2);
    }
}
