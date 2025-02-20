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

    public static void main(String[] args) {
        // print(0, 5);
        // linear(1, 5);
        // decreaOrder(1, 5);
        // backLinear(4, 4);
        backDecrese(1, 5);
    }
}
