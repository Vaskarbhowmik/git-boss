package Class12.java;

public class indexof {
    public static void main(String[] args) {

        String name = "Today is saturday";
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a') {
                System.out.println(i);
            }

        }
    }
}