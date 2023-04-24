package class10;

public class javaarreyenhanced2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
