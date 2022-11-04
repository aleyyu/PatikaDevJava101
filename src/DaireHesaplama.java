import java.util.Scanner;
public class DaireHesaplama {
    public static void main(String[] args){
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        Scanner input = new Scanner(System.in);

        double r, alan, cevre, dilimAlan;
        double pi = 3.14;
        int merkezAci;

        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.println("Dilim alanı için merkez açı değeri giriniz: ");
        merkezAci = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;
        dilimAlan = (pi * (r*r) * merkezAci) / 360;

        System.out.println("Çevre: "+ cevre);
        System.out.println("Alan: "+ alan);
        System.out.println("Dilim alanı: "+ dilimAlan);




    }
}
