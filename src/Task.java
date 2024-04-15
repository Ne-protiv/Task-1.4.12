import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        String day = sc.nextLine();
        System.out.println(isWeekend(day));
    }

    public static String isWeekend(String weekDay) {
        return weekDay.equals("Saturday") || weekDay.equals("Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }
}
