package class10;

public class evenarrey {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2},

        };

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element % 2 == 0)

                {
                    System.out.println(element);


                    }
                }
            }
        }
    }
