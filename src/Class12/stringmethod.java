package Class12;

public class stringmethod {
    public static void main(String[] args) {



    String username="";
    String password="";
    String confirmpassword="sun12345678";
        System.out.println("Enter the password:");
        if (username.isEmpty() && password.isEmpty()) {
        System.out.println("Username or Password cannot be empty");
    } else if (password.length() < 8) {
        System.out.println("Password is too short");
    } else if (password.contains(username)) {
        System.out.println("Password cannot contain username");
    } else if (!confirmpassword.equals(confirmpassword)) {
        System.out.println("Passwords do not match");
    } else {
        System.out.println("Your username and password has been create");
}
    }
}