package class15;

public class staticvariable {
    String name;
    static int age =10;

    void print() {
        int age = 10;
        System.out.println(age);
        System.out.println(name);
        System.out.println(age);
    }

    void println(){
        System.out.println(name);

    }

    static void printname(){
        System.out.println(age);
        //System.out.println(name);
    }
}
