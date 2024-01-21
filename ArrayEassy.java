import java.util.HashSet;

public class ArrayEassy {
    public static int largest(int arr[]) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void SecondLargest(int arr[]) {
        int large = arr[0];
        int slarge = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                slarge = large;
                large = arr[i];
            }
        }
        System.out.println("Second largest in the array is " + slarge);

    }

    public static boolean ischeck(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;

            }
        }
        return true;
    }

    public static void removeDup(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int x : hs) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 7, 55, 6 };
        int arr[] = { 1, 2, 3, 3, 2, 1 };
        // int arr[] = { 1, 2, 3, 4 };//for check ischeck function
        // System.out.println("Largest Number in the array " + largest(arr));
        // SecondLargest(arr);
        // System.out.println(ischeck(arr));
        removeDup(arr);

    }
}
