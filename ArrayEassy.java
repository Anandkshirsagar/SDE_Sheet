import java.util.ArrayList;
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

    public static void removeZeroEnd(int arr[]) {
        ArrayList<Integer> ar = new ArrayList<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                ar.add(arr[i]);
            }
        }
        int len1 = ar.size();
        for (int j = 0; j < len1; j++) {
            arr[j] = ar.get(j);
        }
        for (int i = len1; i < len; i++) {
            arr[i] = 0;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static int LinearSearch(int arr[], int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;

            }
        }

        return -1;
    }

    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr1) {
            hs.add(x);
        }
        for (int y : arr2) {
            hs.add(y);
        }
        for (int k : hs) {
            System.out.println(k);
        }
    }

    public static void intersection(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int temp[] = new int[5];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                temp[k] = arr1[i];
                k++;
            }
            if (arr1[i] < arr2[j]) {
                return;

            }
        }
        for (int z : temp) {
            System.out.println(z);
        }
    }

    public static void maxSubArrSum(int arr[]){
int k=3;
int sum=0;
int len=0;                        //incomplete
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr.length;j++){
      sum+=arr[j];
      if(sum==k){
        len=Math.max(len,i-(j+1));
      }

    }
    
}
System.out.println(len);
}
    public static void main(String[] args) {
        //int arr[] = { 1, 2, 7, 0, 55, 0, 6, 0 };
        // int arr[] = { 1, 2, 3, 3, 2, 1 }; // for check remove duplicate from arr
        // int arr[] = { 1, 2, 3, 4 };//for check ischeck function
        // System.out.println("Largest Number in the array " + largest(arr));
        // SecondLargest(arr);
        // System.out.println(ischeck(arr));
        // removeDup(arr);
        // leftRoteteByOne(arr);
        // rotateDplace(arr, 3);
        // removeZeroEnd(arr);
        // System.out.println(LinearSearch(arr, 78));
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 5, 6 };
        // union(arr1, arr2);
        //intersection(arr1, arr2);
        int arr[]={1,2,3,1,1,1,3};
        maxSubArrSum(arr);           //incomplte review

    }
}
