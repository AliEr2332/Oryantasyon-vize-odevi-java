import java.util.Scanner;

public class DaireHesabi {
    public static void main(String args []){

        System.out.println("Yarıçap giriniz");

        Scanner girilenSayi = new Scanner(System.in);
        double yariCap = girilenSayi.nextDouble();

        double pi = 3.14;
        double cevre = 2*pi*yariCap;
        double alan = pi*yariCap*yariCap;

        System.out.println("Dairenin çevresi ="+cevre+"\nDairenin alanı=" +alan);


    }
}
