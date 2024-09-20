import java.util.*;

public class Array {
    // function
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == key) {
                    System.out.print("found at index (" + i +","+ j + ")");
                    return true;
                }

            }
           
        }
        System.out.println(" not found");
        return false;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        // int n=matrix.length;
        // int m=matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
              
            }
            System.out.println();
        }
        search(matrix, 9);
    }
}