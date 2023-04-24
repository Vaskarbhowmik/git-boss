package classbreakcontinueandnestedloopclass8;

public class javanestedloop {
    public static void main(String[] args) {
        for(int i=0; i>=5;i++){             //outer loop
            System.out.println(i);
            for(int j=0; j<=3;j++){         //inner loop depend on outer loop
                System.out.println(j);
            }
        }
    }
}
