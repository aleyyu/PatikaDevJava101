import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        int mat = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        int muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + muzik + tarih;
        double ortalama = (double)(toplam / 6);
        System.out.println("Ortalama: " + ortalama);
        String sonuc = ortalama > 60.0 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}
