import java.util.Scanner;import java.util.Random;

public class SayiTahmin {
    public static void main (String args []) {

        System.out.println("Lütfen 1-10 arasında bir sayı giriniz: ");

        Scanner giris = new Scanner(System.in);
        int tahmin = giris.nextInt();

        Random randomSayi = new Random();
        int sayi = randomSayi.nextInt(11);

        while (tahmin != sayi) {

            if(tahmin < 0 || tahmin > 10 ) {
                System.out.println("1 ile 10 arasında bir değer giriniz: ");
                tahmin = giris.nextInt(); }

            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = giris.nextInt(); }

            else{
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = giris.nextInt();}
        }

        System.out.println("Tebrikler, kazandınız!"); }
}