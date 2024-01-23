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
        int len = hs.size();
        int temp[] = new int[len];
        int i = 0;
        for (int x : hs) {
            temp[i++] = x;
        }
        for (int z : temp) {
            System.out.println(z);
        }

    }

    public static void leftRoteteByOne(int arr[]) {
        int temp = arr[0];
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            arr[i - 1] = arr[i];
        }
        arr[len - 1] = temp;

        for (int x : arr) {
            System.out.println(x);
        }

    }

    public static void rotateDplace(int arr[], int d) {
        int len = arr.length;
        d = d % len;
        System.out.println(d + " d");
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int j = d; j < len; j++) {
            arr[j - d] = arr[j];
        }
        int l = 0;
        for (int k = len - d; k < len; k++) {
            arr[k] = temp[l++];
        }
        for (int m : arr) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 55, 6 };
        // int arr[] = { 1, 2, 3, 3, 2, 1 }; // for check remove duplicate from arr
        // int arr[] = { 1, 2, 3, 4 };//for check ischeck function
        // System.out.println("Largest Number in the array " + largest(arr));
        // SecondLargest(arr);
        // System.out.println(ischeck(arr));
        // removeDup(arr);
        // leftRoteteByOne(arr);
        rotateDplace(arr, 3);

    }
}
