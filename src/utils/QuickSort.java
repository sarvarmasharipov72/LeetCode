package utils;

public class QuickSort {

    static void quickSort(int [] arr, int low, int heig) {
        if (low < heig) {
            int pi = patrition(arr, low, heig);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, heig);
        }



    }

    static int patrition (int[] arr, int low, int heig) {

        var pivot = arr[heig];

        int i = low - 1;

        for (int j = low; j <= heig; j++) {

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, heig);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        quickSort(new int[] {6,4,3,7,10,9,2,8,1,5}, 0, 9);
    }
}
