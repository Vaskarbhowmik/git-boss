package localinstancestaticclass16;

public class moreexample {

         String name;
        public void printInfo(String password){
            if(password.equals("pass123")){
                System.out.println(name);
            }else{
                System.out.println("You need tpo provide password to access this info");
            }

        }
}
