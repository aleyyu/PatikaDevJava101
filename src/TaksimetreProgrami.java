import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 20;
        int acilis = 10;
        double pricePerKm = 2.2;
        System.out.print("Mesafeyi giriniz (KM): ");
        double mesafe = input.nextDouble();
        double ucret = (double)acilis + pricePerKm * mesafe;
        if (ucret < (double)min) {
            ucret = (double)min;
        }

        System.out.println("KM: " + mesafe);
        System.out.println("ucret: " + ucret);
    }
}
