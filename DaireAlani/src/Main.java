import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int aci;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        // 𝜋 sayısını = 3.14 alınız.
        // Formül : (𝜋 * (r*r) * 𝛼) / 360

        System.out.print("Açı giriniz: ");
        aci = input.nextInt();

        double daireDilimi = (alan * aci) / 360;
        System.out.println("Daire diliminin alanı: " + daireDilimi);

    }
}