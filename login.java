import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Ganang";
        String password = "12345";

        System.out.print("enter Username : ");
        String Username = sc.nextLine();

        System.out.print("enter Password : ");
        String Password = sc.nextLine();

        if (Username.equals(username) && Password.equals(password)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }

    }
}