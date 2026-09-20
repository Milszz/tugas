import java.util.Scanner;

public class KasirMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan status member: ");
        String status = input.next();

        if (status.equals("GOLD")) {
            System.out.println("Diskon 20%");
        } else if (status.equals("SILVER")) {
            System.out.println("Diskon 15%");
        } else if (status.equals("BRONZE")) {
            System.out.println("Diskon 10%");
        } else {
            System.out.println("Diskon 0%");
        }
    }
}