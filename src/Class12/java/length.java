package Class12.java;

public class length {
    public static void main(String[] args) {

      String username = "admin";
      String password = "pass123";
        String userName="admin";
        String passWord="pass123";
        //write code to check the username and the password if the username and
        //password are less than 8 chara
        if (userName.length()<8 && passWord.length()<8){
            System.out.println("signup successful");
        }else{
            System.out.println("username and the password can't be more than 8 characters");
        }
    }
}


