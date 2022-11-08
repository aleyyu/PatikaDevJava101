import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. dik kenar için değer girin: ");
        int kenar1 = input.nextInt();
        System.out.print("2. dik kenar için değer girin: ");
        int kenar2 = input.nextInt();
        double hipotenus = Math.sqrt((double)(kenar1 * kenar1 + kenar2 * kenar2));
        System.out.println("Hipotenüs: " + hipotenus);
        double u = ((double)(kenar1 + kenar2) + hipotenus) / 2.0;
        double cevre = 2.0 * u;
        double alan = Math.sqrt(u * (u - (double)kenar1) * (u - (double)kenar2) * (u - hipotenus));
        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
