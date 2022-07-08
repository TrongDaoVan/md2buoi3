import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, max, index;
        int[] array;
        System.out.println("Bạn muốn mảng có bao nhiêu phần tử nhỉ:");
        size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Nhiều quá tìm mệt lắm b ayy");
        } else {
            array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Mời bạn nhập phần tử thứ " + (i+1));
                array[i] = scanner.nextInt();
            }
            System.out.println("Các phần tử trong mảng là: ");
            for (int element : array) {
                System.out.println(element);
            }
            max = array[0];
            index = 1;
            for (int j=0;j< array.length;j++) {
                if (max<array[j]) {
                    max = array[j];
                    index = j + 1;
                }
            }System.out.println("Giá trị lớn là = " + max + "Vị trí thứ = " + index);
        }
    }
}
