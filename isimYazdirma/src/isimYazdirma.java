import java.util.Scanner;

public class isimYazdirma {
    public static void main (String args []){

        System.out.println("İsim giriniz ");

        Scanner girilenIsim = new Scanner(System.in);
        String isim = girilenIsim.nextLine();

        System.out.println("kaç kere tekrar edilsin");

        Scanner girilenSayi = new Scanner(System.in);
        int sayi = girilenIsim.nextInt();


        for (int i = 0; i<sayi ; i++){
            System.out.println(isim);
        }











    }
}
