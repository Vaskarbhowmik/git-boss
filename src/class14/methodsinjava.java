package class14;

public class methodsinjava {
    void printword (String word) {  // void= never return anything //print word= name of the method
        System.out.println(word);  // string word= pere meter/input
                                   // System.out.println(word)=body of the method
    }

    public static void main(String[] args) {
        methodsinjava obj = new methodsinjava();
        obj.printword("java");
    }

}
