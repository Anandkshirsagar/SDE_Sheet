import java.util.ArrayList;

class ak {
    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void MergeSort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static int partition(int arr[], int low, int high) {

        int pivote = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivote && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivote && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }

        return j;
    }

    public static void QS(int arr[], int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            QS(arr, low, index - 1);
            QS(arr, index + 1, high);
        }

    }

    public static int[] Quicksort(int arr[]) {
        QS(arr, 0, arr.length - 1);
        return arr;
    }
}

public class Sorting2 {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 6, 5 };
        int n = arr.length;

        ak obj = new ak();
        // obj.MergeSort(arr, 0, n - 1);

        arr = obj.Quicksort(arr);
        obj.QS(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}