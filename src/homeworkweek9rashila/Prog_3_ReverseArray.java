package homeworkweek9rashila;
// Write a Java program to reverse an array of integer values.
public class Prog_3_ReverseArray {

    public static void main(String[] args) {

        // Initialize array
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Actual Array List : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("********************************************");
        System.out.println("Array in Reverse List : ");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
