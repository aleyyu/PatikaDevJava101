import java.util.Scanner;
public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz: ");
        double r = input.nextDouble();
        System.out.println("Dilim alanı için merkez açı değeri giriniz: ");
        int merkezAci = input.nextInt();
        double cevre = 2.0 * pi * r;
        double alan = pi * r * r;
        double dilimAlan = pi * r * r * (double)merkezAci / 360.0;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
        System.out.println("Dilim alanı: " + dilimAlan);
    }
}
