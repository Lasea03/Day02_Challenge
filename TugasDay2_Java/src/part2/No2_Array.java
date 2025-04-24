package part2;
import java.util.Arrays;
public class No2_Array {
        public static void main(String[] args) {
            String[] test1 = {"donout", "king", "donout"};
            printInputAndResult(test1);

            String[] test2 = {"min", "max", "min"};
            printInputAndResult(test2);

            String[] test3 = {"true", "false", "false"};
            printInputAndResult(test3);
        }

        public static void printInputAndResult(String[] inputArr) {
            boolean result = isPalindromString(inputArr);

            System.out.println("Input:  " + Arrays.toString(inputArr));
            System.out.println("Result: " + result);
            System.out.println(); // untuk spasi antar output
        }

        public static boolean isPalindromString(String[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (!arr[i].equals(arr[arr.length - i - 1])) {
                    return false;
                }
            }
            return true;
        }
    }


