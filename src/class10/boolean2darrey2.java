package class10;

public class boolean2darrey2 {
    public static void main(String[] args) {
        boolean[][] myboolean = {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        for (boolean[] name1darr : myboolean) {
            for (boolean name : name1darr) {                //enhanced loop//
                System.out.print(name + "   ");
            }
        }
    }
}