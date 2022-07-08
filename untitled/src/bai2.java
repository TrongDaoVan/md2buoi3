public class bai2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,};
        int[] a1 = addElement(arr, 3, 100);
        for (int a:a1) {
            System.out.println(a);
        }
    }
    public static int[] addElement(int[] arr, int index, int x) {
        int a = arr.length;
        int[] newarr = new int[a+1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        newarr[index] = x;
        for (int i=index + 1; i<a+1;i++) {
            newarr[i] = arr[i-1];
        }
        return newarr;
    }
}
