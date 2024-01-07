public class Recursion_Problems {
    public static void print_Name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Anand");
        print_Name(i + 1, n);
    }

    public static void linear(int i, int n) {
        if (i > n) {
            return;
        } else {
            System.out.println(i);
        }

        linear(i + 1, n);
    }

    public static void RevLinear(int i, int n) {
        if (n < i) {
            return;
        } else {
            System.out.println(n);
        }
        RevLinear(i, n - 1);
    }

    public static void main(String[] args) {
        // print_Name(1, 3);
        // linear(1, 10);
        RevLinear(1, 10);
    }
}
