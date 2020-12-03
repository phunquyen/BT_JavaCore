package BaiTap;

import java.util.Scanner;

public class Bai1_NhapSo {
    
    public static void main(String[] args) {
        int enterNumber;
        int originNumber = 21;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            enterNumber = scanner.nextInt();
            if (originNumber == enterNumber) {
                System.out.println("Success !");
                break;
            }
            count++;
        }
        if(count > 4){
            System.out.println("Error!");
        }
    }
}
