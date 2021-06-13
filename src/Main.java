import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kmPrice = 0.10;
        double discountedAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi KM türünden giriniz : ");
        double km = input.nextDouble();
        if (km <= 1) {
            System.out.println("Hatalı veri girdiniz!!");
            System.exit(0);
        }

        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = input.nextInt();
        if (age <= 0) {
            System.out.println("Negatif yaş girilemez!!");
            System.exit(0);
        }

        System.out.print("Lütfen yolculuk tipini seçiniz\n1-Tek Yön -- 2-Gidiş Dönüş ");
        int select = input.nextInt();
        if (select != 1 && select != 2) {
            System.out.println("Yanlış seçim yaptınız!!");
            System.exit(0);
        }

        double amount = kmPrice * km;

        if (select == 1) {
            if (age < 12) {
                discountedAmount = amount * 0.5;
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            } else if (age <= 24) {
                discountedAmount = amount * 0.9;
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            } else if (age <= 65) {
                System.out.println("Toplam tutar = " + amount + " TL");
            } else {
                discountedAmount = amount * 0.8;
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            }
        } else {
            if (age < 12) {
                discountedAmount = 2 * (amount * 0.5 * 0.8);
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            } else if (age <= 24) {
                discountedAmount = 2 * (amount * 0.9 * 0.8);
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            } else if (age <= 65) {
                amount = amount * 2;
                System.out.println("Toplam tutar = " + amount + " TL");
            } else {
                discountedAmount = 2 * (amount * 0.8 * 0.8);
                System.out.println("Toplam tutar = " + discountedAmount + " TL");
            }
        }
    }
}
