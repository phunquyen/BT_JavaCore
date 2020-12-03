package BaiTap;

import java.util.Scanner;

public class Bai2_TinhTienDien {
    public static void main(String[] args) {
        int numberElectric = 0;
        int price = 0;

        do {
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            numberElectric = scanner.nextInt();
            if (numberElectric < 100) {
                price = numberElectric * 1000;
                System.out.println("Price: " + price + "d");
            } else if (numberElectric >= 150) {
                int numberElectricFrom150 = numberElectric - 149;
                price = 99 * 1000 + 50 * 1500 + numberElectricFrom150 * 2000;
                System.out.println("Price: " + price + "d");
            } else {
                int numberElectricFrom100 = numberElectric - 99;
                price = 99 * 1000 + numberElectricFrom100 * 1500;
                System.out.println("Price: " + price + "d");
            }
        }
        while (numberElectric > 0);
    }
}
