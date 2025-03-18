public class Search2DMatrix {
    public static boolean search(int arr[][], int key) {
        int row = 0, col = arr.length - 1;
        while (row <= arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Key found at index ( " + row + " , " + col + " )");
                return true;
            } else if (arr[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int key = 2;
        search(arr, key);
    }
}
