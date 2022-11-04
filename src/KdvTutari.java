import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args){
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
        KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        double price;
        double kdv = 0;
        double kdvTutar;
        double kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz: ");
        price = input.nextDouble();
        if(price < 1000.0 && price > 0){
            kdv = 0.18;
        }
        else if(price > 1000.0){
            kdv = 0.8;
        }
        System.out.println("Ürünün KDV'siz fiyatı: "+ price);
        kdvTutar = price * kdv;
        System.out.println("Ürünün KDV miktarı: " + kdvTutar);
        kdvliFiyat = price + kdvTutar;
        System.out.println("Ürünün KDV'li fiyatı: "+ kdvliFiyat);

    }
}
