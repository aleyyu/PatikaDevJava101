import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
        */

        Scanner input = new Scanner(System.in);

        double mesafe;
        int min = 20;
        int acilis = 10;
        double pricePerKm = 2.20;
        double ucret;

        System.out.print("Mesafeyi giriniz (KM): ");
        mesafe = input.nextDouble();

        ucret = acilis + (pricePerKm * mesafe);
        if(ucret < min){
            ucret = min;
        }
        System.out.println("KM: "+ mesafe);
        System.out.println("ucret: "+ ucret);
    }
}
