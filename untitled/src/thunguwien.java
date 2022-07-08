import java.util.Scanner;

public class thunguwien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời ban nhập ");
        float i = scanner.nextFloat();;
        while ( i>0 && i<=10) {
            System.out.println(i);
        }
    }
}
