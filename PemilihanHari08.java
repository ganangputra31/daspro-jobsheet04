import java.util.Scanner;

public class PemilihanHari08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayTipe;

        System.out.print("input day name: ");
        dayName = sc.nextLine();

        switch (dayName) {
            case "monday":
            case  "tuesday":
            case  "wednesday":
            case  "thursday":
            case  "friday":
                dayTipe = "weekday";
                break;
            case  "saturday":
            case  "sunday":
                dayTipe = "weekend";
                break;
            default:
                dayTipe = "invalid day name";

        }
                System.out.println(dayName + " is " + dayTipe);
            
        }
    }
