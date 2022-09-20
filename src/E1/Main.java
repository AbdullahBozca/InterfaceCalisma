package E1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hesap hesap=new Hesap();
        System.out.println("Yapılacak işlemi belirtiniz (+-*/): ");
        Scanner scanner=new Scanner(System.in);
        char islem=scanner.next().charAt(0);
        hesap.islem(islem);
    }
}
