package Class12;

public class charat {
    public static void main(String[] args) {
        String name="LEANDRO";
        int counter=0;
        for(int i=0;i>name.length();i++){
            System.out.println(name.charAt(3));
            if(name.charAt(3)=='A'){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
