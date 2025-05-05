package src;

import java.util.Scanner;

public class Car {
    Scanner input = new Scanner(System.in);

    String name;
    private int price;
    int pelak;
    boolean validPrice = false;

    public Car(String name, int pelak) {
        this.name = name;
        this.pelak = pelak;
        setPrice(); // فراخوانی متد برای دریافت قیمت
    }

    public int getPrice() {
        return price;
    }

    // متد برای دریافت قیمت معتبر
    public void setPrice() {
        while (!validPrice) {
            System.out.print("Enter price (between 100 and 999): ");
            price = input.nextInt();
            System.out.println(" --------------------");

            if (price > 100 && price < 999) {
                this.price = price;
                validPrice = true;
                System.out.println("Price is valid");
                System.out.println("Price is: " + price + "\n --------------------");
            } else {
                System.out
                        .println("Error!!! ... \n" + " Price must be between 100 and 999" + "\n --------------------");
            }
        }
    }

    public void enter() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Pelak : " + pelak + "\n --------------------");
    }

    public void exit() {
        System.out.println("Exit");
    }
}
