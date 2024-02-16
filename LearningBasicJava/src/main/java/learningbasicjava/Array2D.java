
package learningbasicjava;

import java.util.Scanner;


public class Array2D {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] matrix=new int[3][3];
        System.out.println("Enter 3*3 matrix element: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    
}
