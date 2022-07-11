import java.util.Scanner;

public class thuchanh_sao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Mời bạn Nhập điểm người thứ " +(i+1));
            int x = scanner.nextInt();
            while (x<0 || x>10) {
                System.out.println("làm gì có điểm bé hơn 0 và lớn 10");
                System.out.println("Nhập lại điểm người thứ " + (i+1));
                x = scanner.nextInt();
            }
            arr[i] = x;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                System.out.println("Điểm thi đỗ là "+ arr[i]);
            }
        }
    }
}

