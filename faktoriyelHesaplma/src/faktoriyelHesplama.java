import java.util.Scanner;

public class faktoriyelHesplama {
    public static void main(String args[]){

    System.out.print("Sayı Giriniz");
    Scanner scanner = new Scanner(System.in);
    int sayi = scanner.nextInt();

    int carpim = 1;

    for (int i = 1; i<=sayi; i++){
        carpim = carpim * i;
    }

    System.out.println(sayi+"! = " +carpim);
}
}


