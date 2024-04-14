import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        String day = sc.nextLine();
        if (isWeekend(day)) {
            System.out.println("Ура, выходной!");
        } else System.out.println("Надо еще поработать");
    }

    public static boolean isWeekend(String weekDay) {
        return weekDay.equals("Saturday") || weekDay.equals("Sunday") ? true : false;
    }
}
