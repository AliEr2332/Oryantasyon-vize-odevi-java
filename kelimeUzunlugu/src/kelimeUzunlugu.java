import java.util.Scanner;

public class kelimeUzunlugu {
    public static void main(String args []){

        System.out.println("Bir kelime giriniz");

        Scanner scanner = new Scanner(System.in);
        String isim = scanner.nextLine();

        System.out.println("girilen kelime "+isim.length()+" harflidir");
    }
}

