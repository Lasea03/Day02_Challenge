package part2;
import java.util.Arrays;

public class No3_Array {
    public static void main(String[] args) {
        // Test cases
        int[] myNums1 = {1, 3, 2, 4};
        displayArray(addOnePlus(myNums1));

        int[] myNums2 = {1, 4, 8, 9};
        displayArray(addOnePlus(myNums2));

        int[] myNums3 = {9, 9, 9, 9};
        displayArray(addOnePlus(myNums3));
    }

    // Method untuk menambah angka 1 pada elemen terakhir, atau memperbesar array jika terakhir 9
    public static int[] addOnePlus(int[] arr) {
        // Mulai dari angka terakhir
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++; // Jika angka terakhir kurang dari 9, langsung tambah 1
                return arr;
            }
            arr[i] = 0; // Jika angka adalah 9, set menjadi 0
        }

        // Jika semua angka adalah 9, tambahkan elemen baru di awal array
        int[] result = new int[arr.length + 1];
        result[0] = 1; // Set angka pertama menjadi 1
        return result;
    }

    // Method untuk menampilkan array
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
