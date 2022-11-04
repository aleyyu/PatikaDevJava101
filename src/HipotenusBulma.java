import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args){
        /*
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        Scanner input = new Scanner(System.in);

        int kenar1, kenar2;
        double hipotenus, cevre, alan, u;

        System.out.print("1. dik kenar için değer girin: ");
        kenar1 = input.nextInt();
        System.out.print("2. dik kenar için değer girin: ");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs: "+ hipotenus);

        u = (kenar1 + kenar2 + hipotenus) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - hipotenus));
        System.out.println("Üçgenin Çevresi: "+ cevre);
        System.out.println("Üçgenin Alanı: "+ alan);

    }
}
