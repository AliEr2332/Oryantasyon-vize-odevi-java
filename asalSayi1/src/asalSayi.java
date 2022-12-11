import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        boolean asal = true;
        int sayı = scanner.nextInt();
        if (sayı==1){
            System.out.println(sayı+" Sayısı asal değildir");
            return;
        }
        if (sayı<1){
            System.out.println(sayı+" Sayısı Geçersiz Bir Sayıdır");
            return;
        }





        for (int i=2; i<sayı;i++){
            if (sayı % i == 0) {
                asal = false;

            }



        }
        if (asal){
            System.out.println(sayı + " Sayısı asaldır");
        }else {
            System.out.println(sayı + " Sayısı asal değildir");
        }
    }
}