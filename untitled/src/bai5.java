import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mời bạn nhập phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMin(arr));


    }
    public static int findMin (int[] ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }

        }
        return min;
    }
}
