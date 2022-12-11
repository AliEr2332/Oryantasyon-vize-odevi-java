import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        System.out.println("Gidilen kilometreyi giriniz");
        Scanner giris1 = new Scanner(System.in);
        double km = giris1.nextDouble();

        double acilisUcreti , gunduz , gece ;

        acilisUcreti = 10;
        gunduz = 4.5;
        gece = 7.5;

        System.out.println("gündüz tarifesi için 1'e\ngece tarifesi için 2'ye basınız.");

        Scanner giris2 = new Scanner(System.in);
        int tarife = giris2.nextInt();

        switch (tarife){
            case 1:
                System.out.println("ücret: "+(acilisUcreti + (km * gunduz) ) );
                break;
            case 2:
                System.out.println("ücret: "+(acilisUcreti + (km * gece) ) );
                break;
        }


    }
}
