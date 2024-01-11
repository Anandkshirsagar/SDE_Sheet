import java.util.Scanner;

public class Sorting1 {
    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.println("After Sorting");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        Selection(arr);
    }
}
