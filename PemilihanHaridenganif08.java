import java.util.Scanner;

public class PemilihanHaridenganif08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName;

        System.out.print("input day name: ");
        dayName  = sc.nextInt();
        if (dayName >= 1 && dayName <= 5) {
            System.out.print("weekday");
        } else if (dayName == 6 || dayName == 7) {
            System.out.print("weekend");
        } else {
            System.out.print("invalid day name"); 
        } 

    }
}
    