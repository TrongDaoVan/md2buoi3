public class bai1 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        int[] x = deleteElement(array, 4);
        for (int trong:x) {
            System.out.println(trong);
        }

    }
    public static int[] deleteElement (int arr[], int index) {
        int a = arr.length;
        int[] newarr = new int[a - 1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (int i=index; i<a-1;i++) {
            newarr[i] = arr[i+1];
        }
        return newarr;
    }
}

