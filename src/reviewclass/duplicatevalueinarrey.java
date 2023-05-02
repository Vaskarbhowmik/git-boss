package reviewclass;

public class duplicatevalueinarrey {
    public static void main(String[] args) {
        int[][] numbers = {
                {58, 78},
                {66, 78},
                {68, 79},
                {69, 79},
                {68, 83},
                {63, 81},
                {56, 75},
        };
        int largestNumber = numbers[0][0];
        int secondLargest = 0;
        for (int[] row : numbers) {
            for (int a : row) {
                if (a > largestNumber) {
                    largestNumber = a;
                } else if (a > secondLargest) {
                    secondLargest = a;
                }
                System.out.print(secondLargest+"      ");
            }
        }

    }
}

