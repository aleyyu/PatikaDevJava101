import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args){
        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
     */

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + muzik + tarih;
        double ortalama = toplam / 6;
        System.out.println("Ortalama: "+ ortalama);
        String sonuc = ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);

    }



}
