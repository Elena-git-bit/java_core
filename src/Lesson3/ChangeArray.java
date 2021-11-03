package Lesson3;

public class ChangeArray {
    public static void changeArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.print(arr[i+1]+" ");
            } else {
                System.out.print(arr[i-1]+ " ");
            }
        }
    }
}
