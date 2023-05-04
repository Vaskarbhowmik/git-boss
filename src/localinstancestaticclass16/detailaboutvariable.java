package localinstancestaticclass16;

public class detailaboutvariable {                       // instance variable example
    int a=10;

    public static void main(String[] args) {
        detailaboutvariable nisho1=new detailaboutvariable();
        System.out.println(nisho1.a);
        nisho1.a=6;

        detailaboutvariable nisho2=new detailaboutvariable();
        System.out.println(nisho2.a);
        nisho2.a=7;

        detailaboutvariable nisho3=new detailaboutvariable();
        System.out.println(nisho3.a);
        nisho3.a=8;
    }
}
