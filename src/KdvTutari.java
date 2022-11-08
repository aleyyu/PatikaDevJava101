import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        double kdv = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz: ");
        double price = input.nextDouble();
        if (price < 1000.0 && price > 0.0) {
            kdv = 0.18;
        } else if (price > 1000.0) {
            kdv = 0.8;
        }

        System.out.println("Ürünün KDV'siz fiyatı: " + price);
        double kdvTutar = price * kdv;
        System.out.println("Ürünün KDV miktarı: " + kdvTutar);
        double kdvliFiyat = price + kdvTutar;
        System.out.println("Ürünün KDV'li fiyatı: " + kdvliFiyat);
    }
}
