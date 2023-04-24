package class10;

public class java2darreywithlength2 {
    public static void main(String[] args) {


        int[][] matrix={
                {10 ,20,30,40,50},
                {20 ,50 ,65,20},
                {102, 54,60},
                {20,55}
        };

        for (int row = 0; row < matrix.length; row++) {
//matrix[row]=> will return the complete 1D array at the index specified by the value of row
            for (int column = 0; column <matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }


}
