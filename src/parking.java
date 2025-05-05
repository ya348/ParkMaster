package project;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        // ایجاد پوستر
        String title = "Welcome to Our Parking System";
        String border = "*".repeat(title.length() + 4); // ایجاد خط مرزی

        // چاپ پوستر
        System.out.println(border);
        System.out.println("* " + title + " *");
        System.out.println(border);

        System.out.println("Enter your information");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your car name: ");
        String name = scan.nextLine();
        System.out.print("Enter your car number: ");
        int pelak = scan.nextInt();

        // ایجاد شیء از کلاس Car
        Car car1 = new Car(name, pelak);
        car1.enter(); // نمایش اطلاعات خودرو
        car1.exit(); // خروج از سیستم
        System.out.println("-------------------- \n" + "Thank you for using our parking system");
    }
}
