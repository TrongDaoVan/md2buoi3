public class bai3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array1 = {6,7,8,9,10};
        int[] a = addArray(array, array1);
        for (int x:a) {
            System.out.println(x);
        }
    }
    public static int[] addArray (int[] arr, int[] arr1) {
        int[] newarr = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int j=0;j< arr1.length;j++) {
            newarr[arr.length+j] = arr1[j];
        }
        return newarr;
    }
}
