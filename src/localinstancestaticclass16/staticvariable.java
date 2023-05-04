package localinstancestaticclass16;

public class staticvariable {
    String name;
    String color;
    String breed;

    void bark() {
        System.out.println(name + "is barking");

    }

    void ptintinfo() {
        if (breed.equals("german")) {
            System.out.println(name + color + "i can work in NYPD");
        } else {
            System.out.println(name + "can be used for pet");


        }

    }
     void printlninfo2(){
         if(color.equals("bulldog")){
             System.out.println(name + "color ");
         }
     }
}