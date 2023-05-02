package class15;

public class methodsinjava {
    int[] createdarray(int size) {
    int []arr=new int[size];
    for (int i =0; i <size;i ++){
        arr[1]=10;
    }
     return arr;

    }

    public static void main(String[] args) {
        methodsinjava e1 = new methodsinjava();
        int[]array = e1. createdarray(5);
        for(int i = 0; i< array.length; i ++){
            System.out.println(array[i]);
        }

    }
}
