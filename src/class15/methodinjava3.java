package class15;

public class methodinjava3 {

    int sumarr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        methodinjava3 vas87 = new methodinjava3();
        int sum = vas87.sumarr(new int [] {10,10,10});
        System.out.println(sum);
    }
}