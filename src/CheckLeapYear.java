import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số năm");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    System.out.println("La nam Nhuan");
                } else {
                    System.out.println("Khong la nam nhuan");
                }
            } else {
                System.out.println("La nam Nhuan");
            }
        } else {
            System.out.println("Khong La nam Nhuan");
        }
    }
}
