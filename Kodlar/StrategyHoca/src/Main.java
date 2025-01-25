public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.setPaymentStrategy(new CreditCardPayment("1234-5647-4563-2882", "Fatih Bal"));
        order.processPayment(600);

        order.setPaymentStrategy(new BankTransferPayment("TR123456789654665665"));
        order.processPayment(60000);

        order.setPaymentStrategy(new PayPalPayment("fatihbal@klu.edu.tr"));
        order.processPayment(150000);
    }
}
/* ÖDEV MENÜ

     import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // Kullanıcıdan ödeme tutarını alıyoruz
        System.out.print("Tutar giriniz (TL): ");
        int amount = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizle

        // Ödeme Menüsü
        System.out.println("\n--------------------");
        System.out.println("Ödeme Yöntemi");
        System.out.println("--------------------");
        System.out.println("1- Kredi Kartı ile Ödeme");
        System.out.println("2- Banka Havalesi ile Ödeme");
        System.out.println("3- PayPal ile Ödeme");
        System.out.print("Seçiminiz: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizle

        // Kullanıcı seçimine göre ödeme işlemi
        switch (choice) {
            case 1:
                System.out.print("Kredi Kartı Numarası: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Kart Sahibinin Adı: ");
                String cardHolder = scanner.nextLine();
                order.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolder));
                break;

            case 2:
                System.out.print("IBAN Numarası: ");
                String iban = scanner.nextLine();
                order.setPaymentStrategy(new BankTransferPayment(iban));
                break;

            case 3:
                System.out.print("PayPal E-posta Adresi: ");
                String email = scanner.nextLine();
                order.setPaymentStrategy(new PayPalPayment(email));
                break;

            default:
                System.out.println("Geçersiz seçim! Ödeme yöntemi seçilmedi.");
                return;
        }

        // Ödeme işlemi
        order.processPayment(amount);
        scanner.close();
    }
}

*
* */


/*
* Dependecy inejiton ile
* public class Main {
    public static void main(String[] args) {
        // Kredi Kartı ile ödeme stratejisini context'e doğrudan veriyoruz
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        Order context = new Order(creditCardPayment);
        context.pay(100); // Çıktı: 100 TL kredi kartı ile ödendi. Kart No: 1234-5678-9876-5432

        // PayPal ile ödeme stratejisi için aynı yapı
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com");
        PaymentContext context2 = new PaymentContext(paypalPayment);
        context2.pay(200); // Çıktı: 200 TL PayPal ile ödendi. E-posta: user@example.com
    }
}

*
*
* */