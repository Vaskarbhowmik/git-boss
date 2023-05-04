package localinstancestaticclass16;

public class clearconcept {
            static int a = 30;                    // static variable  / clearconcept is class //
             int b = 20;                         // instance variable
             int c = 10;                          // local  variable

    public static void main(String[] args) {
        int c = 10;
        System.out.println(c);                     // local  variable


        int b = 20;                                // instace
        clearconcept old = new clearconcept();     // object with class/ old is object
        System.out.println(old.b);                 // object.variable


        System.out.println(clearconcept.a);        // static variable / class.variable
    }

}
