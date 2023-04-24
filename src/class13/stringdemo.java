package class13;

public class stringdemo {
    public static void main(String[] args) {
        String str="Today is Sunday. we have java class? we like java * java is everything";
        String [] strArr=str.split("[.!?*]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        }

    }
