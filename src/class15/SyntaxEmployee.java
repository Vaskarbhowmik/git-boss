package class15;

public class SyntaxEmployee {
    String EmploeeID;
    double salary;
    String CEO="Sumair";

    public static void main(String[] args) {
    SyntaxEmployee bhowmik  = new SyntaxEmployee();
    bhowmik.EmploeeID="12345";
    bhowmik.salary=60000;
    System.out.println(bhowmik.CEO);
    //System.out.println(SyntaxEmployee.CEO);



    SyntaxEmployee prince =new SyntaxEmployee();
    prince.EmploeeID="7564784";
    prince.salary=30000;
    System.out.println(bhowmik.EmploeeID);
    System.out.println(prince.EmploeeID);

    }
}
