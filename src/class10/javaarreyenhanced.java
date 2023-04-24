package class10;

public class javaarreyenhanced {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        int num=50;
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=num;
            num=num+10;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
