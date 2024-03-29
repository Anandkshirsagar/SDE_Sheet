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

    public static void linear_Arr(int i, int n) { // using backtracking 1-10
        if (i > n) {
            return;
        }
        linear_Arr(i - 1, n);
        System.out.println(i);

    }

    public static void RevLinearArr(int i, int n) { // using backtracking 10-1
        if (i > n) {
            return;
        }
        RevLinearArr(i + 1, n);
        System.out.println(i);

    }

    public static void Sum_Of_N_Natu_num(int i, int n, int sum) {

        if (i > n) {
            System.out.println("Sum of First N natural Number is " + sum);
            return;
        }

        Sum_Of_N_Natu_num(i + 1, n, sum += i);

    }

    public static void factorial(int i, int n, int fact) {
        if (i > n) {
            System.out.println("Factorial of Number is " + fact);
            return;
        }
        factorial(i + 1, n, fact * i);
    }

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;

        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // print_Name(1, 3);
        // linear(1, 10);
        // RevLinear(1, 10);
        // linear(1, 10);
        // RevLinearArr(1, 10);
        // Sum_Of_N_Natu_num(1, 10, 0);
        // factorial(1, 4, 1);
        System.out.println(Fibonacci(6));

    }
}
