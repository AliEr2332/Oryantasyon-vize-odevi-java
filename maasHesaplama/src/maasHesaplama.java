import java.util.Scanner;

public class maasHesaplama {
    public static void main(String[] args) {

        System.out.println("Çalışma saatini giriniz.");

        Scanner saat = new Scanner(System.in);
        int calismaSaati = saat.nextInt();


        int saatlikUcret = 20;
        int ekMesai = 30;
        int maas = 3200;

        // Aylık zorunlu mesai saati = 160 saat

        if (calismaSaati < 160 ){

            int maas1 = maas - (saatlikUcret*(160 - calismaSaati));
            System.out.println("Maaşınız:"+maas1 );

        }else if (calismaSaati > 160){

            int maas2 = maas + (ekMesai*(calismaSaati- 160));
            System.out.println("Maaşınız:"+maas2 );

        }else {
            System.out.println("Maaşınız:"+maas );
        }


    }
}