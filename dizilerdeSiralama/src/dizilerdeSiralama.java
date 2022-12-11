public class dizilerdeSiralama {
    public static void main(String[] args) {


        {
            int degistirici = 0;
            int[] dizi = {5, 2, 8, 6};
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (dizi[j] < dizi[i]) {
                        degistirici=dizi[j];
                        dizi[j]=dizi[i];
                        dizi[i]=degistirici;
                    }


                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.println(dizi[j]);
            }
        }
    }
}
