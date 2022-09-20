package E1;

import java.util.Scanner;

public class Hesap implements IHesapla, Iisaret{
    Scanner scanner=new Scanner(System.in);
    @Override
    public void toplama(int a, int b) {
        System.out.println("a+b = " + (a+b));
    }

    @Override
    public void cikartma(int a, int b) {
        System.out.println("a-b = " + (a-b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("(a/b) = " + (a/b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("(a*b) = " + (a*b));
    }

    @Override
    public void islem(char a) {
        System.out.println("1. sayıyı giriniz: ");
        int birinciSayi=scanner.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        int ikinciSayi=scanner.nextInt();

        if (a == '+') {
            System.out.println("Toplam = " + (birinciSayi+ikinciSayi));
        }
    }
}
