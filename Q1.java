package QDSA;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 9/2; i++) {
            int temp = arr[i];
            arr[i] = arr[8-i];
            arr[8-i] = temp;
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
