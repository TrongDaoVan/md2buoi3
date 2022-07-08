import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời bạn ăn nha");
        size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Vượt quá 20 rồi b ơi");
        } else {
            array = new int[size];
            for (int i=0;i<size;i++) {
                System.out.println("Mời bạn nhập phần tử " + (i+1));
                array[i] = scanner.nextInt();
            }
            System.out.println("Các phần tử trong mảng là:");
            for (int elen : array) {
                System.out.println(elen);
            }
            for (int j=0; j<array.length/2;j++) {
                int tem = array[j];
                array[j] = array[array.length - 1 - j];
                array[array.length - 1 - j] = tem;
            }
            System.out.println("Đảo ngược thành: ");
            for (int trong : array) {
                System.out.println(trong);
            }
        }
    }
}
