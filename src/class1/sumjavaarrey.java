package class1;

public class sumjavaarrey {
    public static void main(String[] args) {
        int[][] arr2d = {{10, 20, 30, 40},

                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2},

        };
          int sum=0;
          for(int[] arr1d :arr2d){
           for(int num:arr1d){
            sum=sum+num;
    }
          System.out.println(sum);
           sum=0;

}
    }
}
