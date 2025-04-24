package part2;

import java.util.Arrays;

public class No1_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printInputAndResult(arr1);

        int[] arr2 = {3, 4, 5, 2, 10};
        printInputAndResult(arr2);

        int[] arr3 = {2, 4, 6, 10, 1};
        printInputAndResult(arr3);
    }

    public static void printInputAndResult(int[] inputArr) {
        // Salin array agar input tidak berubah saat diproses
        int[] copiedInput = Arrays.copyOf(inputArr, inputArr.length);
        int[] result = orderEvenBeforeOdd(copiedInput);

        System.out.println(Arrays.toString(inputArr) + " → " + Arrays.toString(result));
    }

    public static int[] orderEvenBeforeOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) left++;
            while (left < right && arr[right] % 2 != 0) right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < left - 1; i++) {
            for (int j = 0; j < left - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int oddLen = arr.length - left;
        for (int i = 0; i < oddLen - 1; i++) {
            for (int j = left; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
