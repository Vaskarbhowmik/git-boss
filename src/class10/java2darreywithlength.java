package class10;

public class java2darreywithlength {
    public static void main(String[] args) {
/*
        when ever we repeat code we should repalce it
        with a loop
         */
        int[][] matrix={
                {10 ,20,30},
                {20 ,50 ,65},
                {102, 54,60}
        };
        for (int j = 0; j < matrix.length; j++) {
            // getting the complete oneD array from 2D array
            int [] arr1=matrix[j];
           for (int i = 0; i < arr1.length; i++) {
                //going over all the elements from the oneD array
                System.out.print(arr1[i]+" ");
            }
            // to print all rows on new line
            System.out.println();
        }

    }
}

